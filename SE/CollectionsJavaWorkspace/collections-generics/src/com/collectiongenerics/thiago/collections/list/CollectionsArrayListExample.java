package com.collectiongenerics.thiago.collections.list;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

public class CollectionsArrayListExample {
	
	public static void main(String[] args) {
		
		//List interface
		
		//ArrayList - quando vc deleta o indice zero por exemplo, os objetos a frente dele tomam seu lugar (index)
		List arrayList = new ArrayList();
		arrayList.add("Thiago");
		arrayList.add("Joe");
		arrayList.add("Doe");
		arrayList.stream().forEach(System.out::println);
		arrayList.remove(0);
		arrayList.stream().forEach(System.out::println);
		
		
	
		
	}

}
