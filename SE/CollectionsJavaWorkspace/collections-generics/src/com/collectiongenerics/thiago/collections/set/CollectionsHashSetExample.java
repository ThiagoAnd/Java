package com.collectiongenerics.thiago.collections.set;

import java.util.HashSet;
import java.util.Set;

//Tem a essencia da interface Map
//Não pode conter o mesmo elemento multiplas vezes. 3 Annas por exemplo
public class CollectionsHashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Adam");
		set.add("Joe");
		set.add("Anna");
		set.add("Anna");
		set.add("Thiago");
		set.add("Anna");
		
		System.out.println(set.contains("Anna"));
		
		for (String nome : set) {
			
			System.out.println(nome);
			
		}
		
	}
	
}
