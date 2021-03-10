package com.in28minutes.microservices.currencyexchangeservice.controllers;

import java.net.ConnectException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {

	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);

	// O circuit breaker joga direto para o metodo alternativo, ele não tenta entrar
	// se ver que não esta conseguindo (Verificar o ciclo de vida do circuit
	// breaker)
	// Ratelimiter, limita a taxa de chamadas no metodo, por exemplo, podemos
	// limitar que em 10 segundos poderemos ter somente 1000chamadas
	// @CircuitBreaker(name = "default", fallbackMethod = "testeMetodoAlternativo")
	//@RateLimiter(name = "x")
	 @Bulkhead(name="sample-api")
	@GetMapping("/sample-api")
	// Comentando o Retry, agora vamos usar o CircuitBreaker
	 //@Retry(name="testeRETRY", fallbackMethod = "testeMetodoAlternativo")
	public String sampleApi() {
		logger.info("API call received");
//		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/enderecofalsoblabla",
//				String.class);
//		return forEntity.getBody();
		return "asdfasdf";
	}

	// Essa parte foi legal, quando não estava com esse Exception como parametro,
	// tinha dado uma exception
	// Dizendo que essa classe precisava de um parametro trowable, primeira vez que
	// entendi essa parte no stacktrace
	// Então foi adicionado essa exception, acredito que pode fazer um overload para
	// pegar todos os tipos de exception
	public String testeMetodoAlternativo(ResourceAccessException ex) {
		System.out.println("\n\n" + ex.getMessage());
		System.out.println("\n\n" + ex.getCause());
		System.out.println("\n\n" + ex.getClass());

		return "Metodo alternativo caso falhar determinadas quantidades de vezes para exception ResourceAccesException";
	}

	public String testeMetodoAlternativo(ArithmeticException ex) {
		System.out.println("\n\n" + ex.getMessage());
		System.out.println("\n\n" + ex.getCause());
		System.out.println("\n\n" + ex.getClass());

		return "Metodo alternativo caso falhar determinadas quantidades de vezes para ArithmeticException, que nunca vai acontecer aqui";
	}

}
