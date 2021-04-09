const express = require('express');
const router = express.Router();


//Retorna todos os pedidos
router.get('/',(req,res,next) =>{
    res.status(200).send({
        mensagem: 'Usando o GET dentro da rota de pedidos atuais'
    });
});

//Insere um pedido
router.post('/',(req,res,next) =>{
    res.status(201).send({
        mensagem: 'Usando o POST dentro da rota de pedidos'
    });
});

//Retorna os dados de um pedido
router.get('/:id_pedido',(req,res,next) =>{
    const id = req.params.id_pedido;
    res.status(200).send({
        mensagem: 'Usando o GET de um pedido',
        id: id

    });
});

//Altera um pedido
router.patch('/',(req,res,next) =>{
    res.status(201).send({
        mensagem: 'Usando o PATCH dentro da rota de pedidos'
    });
});

//Exclui um pedido
router.delete('/',(req,res,next) =>{
    res.status(201).send({
        mensagem: 'Usando o DELETE dentro da rota de pedidos'
    });
});

module.exports = router;