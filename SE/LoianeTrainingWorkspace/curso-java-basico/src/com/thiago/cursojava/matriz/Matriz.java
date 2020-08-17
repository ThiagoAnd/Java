package com.thiago.cursojava.matriz;

public class Matriz {

	public static void main(String[] args) {
		
		//double[][] numeros = new double[5][5];

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				if (i == j) {
					System.out.print(" X   ");
				} else {
					System.out.print(i + "," + j + "  ");
				}
			}
			System.out.println("");
		}
	}

}
