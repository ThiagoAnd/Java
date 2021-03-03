package com.in28minutes.rest.webservices.restfulwebservices.models;

import java.util.*;

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
	private String name;
	private Date birthDate;

}
