const express = require('express');
const router = express.Router();


const usuarioController = require('../controllers/usuario-controller');


router.post('/cadastro',usuarioController.cadastrarUsuario);

router.post('/login',usuarioController.autenticarUsuario);

router.get('/',usuarioController.getUsuarios);

module.exports = router;