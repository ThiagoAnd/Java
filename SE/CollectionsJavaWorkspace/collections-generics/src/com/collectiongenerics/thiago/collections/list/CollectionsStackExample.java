package com.collectiongenerics.thiago.collections.list;

import java.util.List;
import java.util.Stack;

//Stack extends o Vector, então ele é uma List, uma Collection, um iterable
public class CollectionsStackExample {
	
	//Last in First out = LIFO, é uma pilha
	public static void main(String[] args) {
		
		//Temos que instanciar o stack de um modo normal
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);

		//Mostra o objeto do topo
		System.out.println(stack.peek());
		
		
	}

}
