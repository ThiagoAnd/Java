const express = require('express')
//Cria uma instancia do express
const app = express();
//mostra no console as rotas
const morgan = require('morgan');
const bodyParser = require('body-parser');


const rotaProdutos = require('./routes/produtos');
const rotaPedidos = require('./routes/pedidos');
const rotaUsuarios = require('./routes/usuarios');

app.use(morgan('dev'));
app.use(bodyParser.urlencoded({ extended: false})); // apenas dados simples
app.use(bodyParser.json()); // Json na entrada do body

app.use((req, res, next) => {
	//Qual site tem permissão de realizar a conexão, no exemplo abaixo está o "*" indicando que qualquer site pode fazer a conexão
    res.header("Access-Control-Allow-Origin", "*");
	//Quais são os métodos que a conexão pode realizar na API
    res.header("Access-Control-Allow-Header",
    'Origin,X-Requested-with,Content-Type,Accept,Authorization');
    if(req.method ==='OPTIONS'){
        res.header('Access-Control-Allow-Methods','PUT, POST, PATCH, DELETE, GET');
        return res.status(200).send({});

    }
    
    next();
});


app.use((req,res,next) => {
    res.header('Access-Control-Allow-Origin','*');
    res.header(
        'Access-Control-Allow-Header',
        'Origin, X-Requested-Witch,Content-Type, Accept, Authorization'
        );
        if (req.method === 'OPTIONS'){
            res.header('Access-Control-Allow- Methods','PUT, POST, PATCH, DELETE , GET ');
            return res.status(200).send({});
        }
        next();
});

app.use('/produtos',rotaProdutos);
app.use('/pedidos',rotaPedidos);
app.use('/usuarios',rotaUsuarios);


//Quando não encontra a rota, quando passou por tudo que esta em cima e não encontrou a rota
app.use((req,res,next) => {
    const erro = new Error('Não encontrado');
    erro.status= 404;
    next(erro);
});

//Complementa o de cima, o next faz ele ir para o proximo
app.use((error,req,res,next)=> {
    res.status(error.status || 500);
    return res.send({
        erro:{
            mensagem: error.message
        }
    });
});
//Exportar esse modulo
module.exports = app;