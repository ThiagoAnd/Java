package com.collectiongenerics.thiago.collections.set;

import java.util.Set;
import java.util.TreeSet;

//Diferente do linked hash set e hash set,que tinham um hashmap para os dois, no TreeSet temos ajuda
// do balanceamento de uma arvore binaria de busca. Sera baseado em busca logaritmica para a maioria das operações
//É uma estrutura de dados ordenada
public class CollectionsTreeSet {
	
	
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		
		set.add(2);
		set.add(10);
		set.add(4);
		set.add(-1);
		set.add(-1);
		
		for(Integer n: set) {
			
			System.out.println(n);
			
		}
		
		
	}

}
