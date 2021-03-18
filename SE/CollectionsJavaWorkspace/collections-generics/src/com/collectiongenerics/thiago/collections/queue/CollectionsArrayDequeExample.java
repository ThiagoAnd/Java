package com.collectiongenerics.thiago.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

//Podemos inserir na frente ou atras
//Podemos retirar da frente ou de tras
//Pode ser usado como uma fila e uma pilha
//É mais rapido que um linkedList e uma Stack
public class CollectionsArrayDequeExample {

	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<>();

		deque.offerFirst(10);
		deque.offerLast(20);
		deque.offerFirst(30);
		deque.offerLast(40);
		
		for(Integer i: deque)
			System.out.println(i);

	}
}
