package br.com.scarlet.apijava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	@ResponseBody // Com o response body o spring entende que o metodo não é um metodo que vai retornar uma pagina, então ele não vai tentar encontrar a palavra hello world, ele vai entender
	//que é o retorno de uma string mesmo
	public String hello () {
		return "Hello World";
	}

}
