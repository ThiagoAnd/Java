package com.collectiongenerics.thiago.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

//Guarda itens internamente de acordo com sua ordem natural, então tem um compare que tem que ser definido, para
//Definir o que devera ser priorizado
//Para definir e para fazer um while por exemplo(não tentei com o for)
//Temos que definir um implements Comparable e adicionar o metodo não implementado Compare para dizer o que queremos
//comparar
public class CollectionsPriorityQueueExample {

	public static void main(String[] args) {
		
		Queue<PersonPriorityQueue> queue = new PriorityQueue<>();
		
		queue.add(new PersonPriorityQueue("Kevin", 22));
		queue.add(new PersonPriorityQueue("Joe", 37));
		queue.add(new PersonPriorityQueue("Adam", 12));
		queue.add(new PersonPriorityQueue("Anna", 45));
		
		while (queue.peek() != null) {
			System.out.println(queue.poll());
		}
		
		
	}
}
