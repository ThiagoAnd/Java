package com.collectiongenerics.thiago.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

//Tem mesmas features que o hashmap mas...
//No hashmap não tem garantias que a ordem de iteração  vai acontecer de forma certa, (testar)
//No linked hashmap tem uma lista duplamente encadeada que vai assegurar que a iteração aconteça na ordem
public class CollectionsLinkedHashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();

		linkedHashMap.put("a", 1);
		linkedHashMap.put("b", 2);
		linkedHashMap.put("c", 3);
		linkedHashMap.put("d", 4);
		linkedHashMap.put("e", 5);
		linkedHashMap.put("f", 6);
		linkedHashMap.put("g", 7);
		linkedHashMap.put("h", 8);
		linkedHashMap.put("i", 9);
		linkedHashMap.put("j", 10);
		linkedHashMap.put("k", 11);
		linkedHashMap.put("l", 12);

		for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {

			System.out.println(entry.getKey() + " - " + entry.getValue());
			
		}
		
		linkedHashMap.forEach((x,y)-> System.out.println("Key: "+x+" - Value: "+y) );
		
		linkedHashMap.entrySet().stream().forEach(System.out::println);

	}

}
