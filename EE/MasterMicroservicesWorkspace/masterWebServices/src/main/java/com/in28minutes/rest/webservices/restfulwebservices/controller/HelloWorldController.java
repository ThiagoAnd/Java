package com.in28minutes.rest.webservices.restfulwebservices.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.beans.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
		
		
	}
	
	//Deste modo para internacionalizar vc teria que colocar o request header em cada metodo, isso não é produtivo, 
	@GetMapping("/hello-internacionall")
	public String helloWorldInternacionalized(@RequestHeader(name="Accept-Language", required=false) Locale locale) {
		return messageSource.getMessage("good.morning.message", null, locale);
			
		
	}
	
	//Modo atualizado
	/*@GetMapping("/hello-internacional")
	public String helloWorldInternacionalized() {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
		
		
	}*/
	
	@GetMapping("/hello-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
		
	}
	
	@GetMapping("/hello/variavel/{name}")
	public HelloWorldBean helloWorldVariavel(@PathVariable String name) {
		return new HelloWorldBean("Hello World "+name);
		
	}

}
