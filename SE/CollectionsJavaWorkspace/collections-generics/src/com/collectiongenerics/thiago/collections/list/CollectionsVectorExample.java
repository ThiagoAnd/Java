package com.collectiongenerics.thiago.collections.list;

import java.util.List;
import java.util.Vector;

//Vector é parecido com array list, mas vector é sincronizado(muitas threads podem manipular o conteudo de um vector)
//Esta usando um ambiente multi thread?É melhor usar o Vector, pois senão pode ocorrer algum problema de perda de memoria dos dados
//Ou então trabalhar com a sincronização do array list se tiver usando ele
public class CollectionsVectorExample {
	
	
	public static void main(String[] args) {
		
		
		//Podemos setar que a capacidade será 10 e o incremento será 5
		List<Integer> vector = new Vector<>(10,5);
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		
		vector.remove(0);
		
		vector.stream().forEach(System.out::println);
		
	}

}
