package com.in28minutes.rest.webservices.restfulwebservices.exceptions;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionResponse  {
	
	private Date timeStamp;
	private String message;
	private String details;

	public ExceptionResponse(Date timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		this.details = details;
	}

	

}
