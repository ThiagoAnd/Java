package com.thiago.cursojava.array;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = new int[10];

		vetor[0] = 10;
		vetor[1] = 15;
		vetor[2] = 47;

		System.out.println("Valor do indice 2 eh " + vetor[1]);
		System.out.println("Tamanho do array eh " + vetor.length);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Indice " + i + " = " + vetor[i]);
		}

		System.out.println("\n");
		for (int array : vetor) {
			System.out.println(array);
		}
		
		
		/*Matrizes*/
		
		

	}

}
