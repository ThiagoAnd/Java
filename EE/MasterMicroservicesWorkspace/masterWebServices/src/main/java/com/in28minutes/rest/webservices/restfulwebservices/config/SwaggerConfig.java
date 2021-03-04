package com.in28minutes.rest.webservices.restfulwebservices.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	// Esses statics foram pegos indo com ctrl+ clique na constante DEFAULT API INFO
	public static final Contact DEFAULT_CONTACT = new Contact("Thiago de Andrade", "github/thiagoand", "thiago.andrade.it@outlook.com");
	
	public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Titulo maravilhoso", "Maravilhosa Documentation", "1.0", "urn:tos",
			DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());

	private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<String>(Arrays.asList("application/jsonnnnnn","application/xmllllll"));

	//Eu só utilizei essa classe para pegar as constantes acima e editar
	//private static final ApiInfo DEFAULT_API_INFO = null;

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(DEFAULT_API_INFO)
				.produces(DEFAULT_PRODUCES_AND_CONSUMES);
	}

}
