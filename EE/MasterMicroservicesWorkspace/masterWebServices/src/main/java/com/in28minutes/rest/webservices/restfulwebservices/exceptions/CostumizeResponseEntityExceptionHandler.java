package com.in28minutes.rest.webservices.restfulwebservices.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//Essa classe é para jogar o formato dos erros para as exceções que aparecem 
//Esse controller advice é para deixar ele aplicaveu em todos os controllers, algo assim
@ControllerAdvice
@RestController
public class CostumizeResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	//Esse metodo abaixo vc acha na linha 124 quando clicar com ctrl no nome do extends
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(UserNotFoundException ex, WebRequest request) throws Exception {
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleUserNotFoundException(UserNotFoundException ex, WebRequest request) throws Exception {
		
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity(exceptionResponse,HttpStatus.NOT_FOUND);
		
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),ex.getBindingResult().toString());
		//ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),"Validation failed");
		return new ResponseEntity(exceptionResponse,HttpStatus.BAD_REQUEST);
	}
	
	

}
