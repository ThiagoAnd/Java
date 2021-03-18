package com.collectiongenerics.thiago.collections.set;

import java.util.LinkedList;
import java.util.Queue;

//Entra no conceito FIFO: first in , first out uma fila normal
//A diferença  do linkedList da List é que la ela é uma lista dinamica
public class CollectionsLinkedListQueueExample {

	public static void main(String[] args) {
		Queue<String> queueLinkedList = new LinkedList<>();
		queueLinkedList.add("Adam 1");
		queueLinkedList.add("Joe 2");
		queueLinkedList.add("Kevin 3");
		
		queueLinkedList.stream().forEach(System.out::println);
		queueLinkedList.remove();
		queueLinkedList.stream().forEach(System.out::println);
		
	}
}
