package com.in28minutes.rest.webservices.restfulwebservices.beans;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class HelloWorldBean {
	
	

	private String message;

	public HelloWorldBean(String msg) {
		this.message = msg;
	}
}
