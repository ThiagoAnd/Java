package com.collectiongenerics.thiago.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


//Inicialmente a iteração acontece em ordem alfabetica , de acordo com o que coloca no primeiro parametro <"String",Integer>
public class CollectionsTreeMapExample {

	public static void main(String[] args) {
	
		
		Map<String,Integer> map = new TreeMap<String, Integer>();
		
		map.put("Adam", 12);
		map.put("Joe", 45);
		map.put("Ana", 78);
		map.put("Kevin", 13);
		map.put("Andrew", 21);
		
		map.entrySet().stream().forEach(System.out::println);
		
	
		
		
	}
	
}
