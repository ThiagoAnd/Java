package com.in28minutesmicroservices.limitsservices.bean;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(access=AccessLevel.PUBLIC)
@NoArgsConstructor
public class Limits {
	
	private int minimum;
	private int maximum;

}
