package com.in28minutesmicroservices.limitsservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class LimitsServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServicesApplication.class, args);
	}

}
