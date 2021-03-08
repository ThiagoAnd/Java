package com.in28minutesmicroservices.limitsservices.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties("limits-service")
public class Configuration {

	
	private int minimum;
	private int maximum;
}
