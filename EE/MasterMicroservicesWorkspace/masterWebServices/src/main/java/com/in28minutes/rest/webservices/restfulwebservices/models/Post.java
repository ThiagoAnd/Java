package com.in28minutes.rest.webservices.restfulwebservices.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Post {

	
	@Id
	@GeneratedValue
	private Integer id;
	private String description;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@Getter(AccessLevel.NONE) 
	//@Setter(AccessLevel.NONE)
	private User user;
}
