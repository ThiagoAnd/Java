package com.collectiongenerics.thiago.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet
//Basicamente, tudo o que se refere ao HashSet tamem vale para o Linked HashSet
//Further, Quando queremos retornar a mesma copia, com os mesmos itens na mesma posição, utilizamos o linkedhashset
//Ele possui uma ordem de iteração previsivel, diferente do que acontece com o hashset, que não tem garantia da ordem
//Mas fica meio estranho, tenho que verificar isso depois, parece que ele usa um MAP por tras que ajuda nessa ordenação
public class CollectionsLinkedHashSetExample {

	public static void main(String[] args) {
	
Set<String> set = new LinkedHashSet<String>();
		
		set.add("Adam");
		set.add("Joe");
		set.add("Anna");
		set.add("Anna");
		set.add("Thiago");
		set.add("Anna");
		
		
		for (String nome : set) {
			
			System.out.println(nome);
			
		}
		
	}

}
