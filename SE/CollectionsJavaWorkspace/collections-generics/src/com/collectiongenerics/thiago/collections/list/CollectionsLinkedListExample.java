package com.collectiongenerics.thiago.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionsLinkedListExample {
//Outra implementação da List e tambem implementa da Queue interface
	//É o que chamamos de single link list
	//É como se fosse uma estrutura encadeada, que o numero de tras sabe a posição do numero da frente
	//Temos tambem a lista duplamente encadeada
	//Se deletar um indice, o de tras aponta para o da frente, não é necessario mover todo mundo para tras, o que torna
	//a linked list rapida para remover, mas para achar, como não é por "indice" é mais demorada do que um arraylIST
	
	
	public static void main(String[] args) {

		List<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(5);
		linkedList.add(10);
		linkedList.add(20);
		
		for (Integer i : linkedList) {
			System.out.println(i);
			
		}		
	}

}
