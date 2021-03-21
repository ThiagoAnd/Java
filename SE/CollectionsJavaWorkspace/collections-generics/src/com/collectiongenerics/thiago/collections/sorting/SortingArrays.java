package com.collectiongenerics.thiago.collections.sorting;

import java.util.Arrays;

//How to sort arrays
//Java usa quick sort para ordenar tipos primitivos
//Merge sort para ordenar custom objects
//Então merge sorte na camada de cima, em objetos, cachorro, gato, etc e quicksort para primitivos
public class SortingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,5,3,8,10,-2,0};
		String[] nomes = {"Adam","Joe","Ana","Kevin","Steven"};
		
		Arrays.sort(nums);
		Arrays.sort(nomes);
		
		for (Integer n:nums) {
			System.out.print(n+" -");
		}
		
		for (String n:nomes) {
			System.out.print(n+" -");
		}
	}

}
