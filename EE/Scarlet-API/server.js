const http = require('http');
//Pega o nosso app
const app = require('./app');


//Criando a variavel que usara a porta do .env e se não tiver usar a porta 3000
const port = process.env.PORT || 3000


//1° Criando o nosso server
//2° Uma vez criado o server, passamos o app dentro do server e ta escutando ele na porta
const server = http.createServer(app);
server.listen(port,function(){
    console.log("Porta "+port+" aberta");
});

