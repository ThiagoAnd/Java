package com.in28minutes.microservices.currencyconversionservice.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.in28minutes.microservices.currencyconversionservice.bean.CurrencyConversion;

// Nome da aplicação que vc vai ligar e url
//@FeignClient(name="currency-exchange",url="localhost:8000")

//Só fazendo isso abaixo o eureka ja busca o nome e retorna o endereço
@FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(@PathVariable String from,@PathVariable String to);

}
