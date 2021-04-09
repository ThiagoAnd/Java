const mysql = require('../mysql').pool;

exports.inserirProduto = (req,res,next) =>{
    console.log(req.file)
   /* const produto = {
       nome: req.body.nome,
        preco: req.body.preco
    }*/
   // const produto = req.body;

    mysql.getConnection((error,conn) =>{
        if(error){return res.status(500).send({error:error})};
        conn.query(
            'INSERT INTO produtos (nome,preco,imagem_produto) VALUES (?,?,?)',
            [req.body.nome,req.body.preco,req.file.path],
            (error,resultado,field)=>{
                conn.release();
                if(error){return res.status(500).send({error:error})};
               
                res.status(201).send({
                    mensagem: 'Produto inserido com sucesso',
                    id_produto: resultado.insertId,
                    produto: req.body 
                });
            }
        )
    });
    //const { numero, rua, bairro, cidade, CNPJ } = req.body;

   
}

exports.getProdutos = (req,res,next) =>{
    
    mysql.getConnection((error,conn) =>{
        
        if(error){return res.status(500).send({error:error})};
        
        conn.query(
            'SELECT * FROM produtos',
            (error,resultado,field)=>{
                conn.release();
                if(error){return res.status(500).send({error:error})};
                const response = {
                    quantidade: resultado.length,
                    produtos: resultado.map( prod =>{
                        return {
                            id_produto: prod.id_produto,
                            nome: prod.nome,
                            preco: prod.preco
                        }
                    })
                }
               
               // return res.status(201).send({ response: resultado });
               return res.status(201).send({ response });
            }
        )
    });


}

exports.getProduto = (req,res,next) =>{
    mysql.getConnection((error,conn) =>{
        if(error){return res.status(500).send({error:error})};
        conn.query(
            'SELECT * FROM produtos where id = ?',
            [req.params.id_produto],
            (error,resultado,field)=>{
                conn.release();
                if(error){return res.status(500).send({error:error})};
               
                return res.status(201).send({ response: resultado });
            }
        )
    });
}


exports.updateProduto = (req,res,next) =>{
    mysql.getConnection((error,conn) =>{
        if(error){return res.status(500).send({error:error})};
        conn.query(
            //Para quebrar linha utilizar a crase `` 

            `UPDATE produtos 
                SET
                    nome = ?,
                    preco = ?
                WHERE
                    id = ?`,
            [req.body.nome,req.body.preco,req.body.id],
            (error,resultado,field)=>{
                conn.release();
                if(error){return res.status(500).send({error:error})};
               
                return res.status(202).send({ mensagem: "Produto alterado com sucesso" });
            }
        )
    });
}

exports.deleteProduto = (req,res,next) =>{
    mysql.getConnection((error,conn) =>{
        if(error){return res.status(500).send({error:error})};
        conn.query(

            'DELETE from produtos WHERE id = ?',
            [req.body.id],
            (error,resultado,field)=>{
                conn.release();
                if(error){return res.status(500).send({error:error})};
               
                return res.status(202).send({ mensagem: "Produto removido com sucesso" });
            }
        )
    });

}