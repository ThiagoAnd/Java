package com.in28minutes.rest.webservices.restfulwebservices.models;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class User {
	
	
	
	
	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	private Integer id;
	
	@Size(min=2,message="O nome deve conter pelo menos 2 caracteres, esta mensagem esta no model User")
	private String name;
	
	@Past
	private Date birthDate;

}
