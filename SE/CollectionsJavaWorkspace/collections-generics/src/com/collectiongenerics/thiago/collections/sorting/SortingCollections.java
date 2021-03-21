package com.collectiongenerics.thiago.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Como ordenar coleções
public class SortingCollections {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(10);
		numbers.add(30);
		numbers.add(3);
		numbers.add(5);
		numbers.add(-3);

		
		Collections.sort(numbers);
		System.out.println(numbers);
	}

}
