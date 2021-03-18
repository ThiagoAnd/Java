package com.collectiongenerics.thiago.genericmethods;

import java.util.List;

public class UpperBoundedWildcards {
	
	//Extendendo assim podemos especificar lista de doubles, lista de inteiros,e podemos iterar, mas não adicionar

	public static void sum(List<? extends Number> list) {
		double sum = 0.0;
		
		//acho que com o upper bound não conseguimos adicionar
		//list.add(new Integer(5));
		
		//Colocamos Number pq não sabemos se pode ser Integer ou double
		for(Number n: list) {
			sum = sum +n.doubleValue();
		}
		System.out.println("A soma é: "+sum);
	}

	public static void main(String[] args) {
		

	}

}
