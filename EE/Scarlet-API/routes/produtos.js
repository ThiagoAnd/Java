const express = require('express');
const router = express.Router();
const login = require('../middleware/login');

const produtoController = require('../controllers/produto-controller');
//Para trabalhar com imagens vamos usar o multer
const multer = require('multer');



//Para passar o nome correto do arquivo no multer
const storage = multer.diskStorage({
  destination: function (req,file,cb){
      cb(null,'./uploads/');
  }  ,
  filename: function(req,file,cb){
    let data = new Date().toISOString().replace(/:/g, '-') + '-';
    cb(null, data + file.originalname );
      
  }
})
const fileFilter = (req,file,cb) => {
    if(file.mimetype === 'image/jpeg' || file.mimetype == 'image/png'){
        cb(null,true);
    }else {
        cb(null,false);
    }
}

const upload = multer({
    storage: storage,
    limits: {
        fileSize: 1024 * 1024 * 5 // Limite de 5MB
    }


});


//Retorna todos os produtos
router.get('/',produtoController.getProdutos);

//Retorna os dados de um produto
router.get('/:id_produto',produtoController.getProduto);

//Altera um produto
router.patch('/',produtoController.updateProduto);

//Exclui um produto
router.delete('/',produtoController.deleteProduto);

//Insere um produto
//A partir do momento que vc coloca mais um parametro que usará o multer, vc muda de json pra form-data no postman
router.post('/',upload.single('produto_imagem'),login.obrigatorio,produtoController.inserirProduto);





module.exports = router;