package com.thiago.cursojava.excecoes;

public class Excecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] vetor = new int[4];
			System.out.println("Antes da exception");
			vetor[4] = 1;
			System.out.println("Esta frase nao sera impressa");
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Erro ao acessar o quinto indice do vetor");

		} finally {
			System.out.println("Esta frase sempre sera impressa");
		}
	}

}
