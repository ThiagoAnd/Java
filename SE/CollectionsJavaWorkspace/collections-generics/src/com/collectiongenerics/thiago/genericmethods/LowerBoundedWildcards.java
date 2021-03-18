package com.collectiongenerics.thiago.genericmethods;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


// Usando super vc vai conseguir adicionar itens a uma lista
public class LowerBoundedWildcards {
	
	public static void show(List<? super Number> list) {
;		

		list.add(Integer.valueOf(4));
		
		for(Object o: list) {
			System.out.println(o);
		}
		
	}

	public static void main(String[] args) {
		
		//String implementa a interface serializable
		List<Serializable> list = new ArrayList<>();
		list.add("Adam");
		list.add("Joe");
		list.add("Joel");
		LowerBoundedWildcards.show(list);
	}
	
}
