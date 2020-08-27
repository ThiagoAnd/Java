package br.com.thiago.estudos;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] vNotas = new int[10];
		for (int i = 0; i <= 9; i++) {
			vNotas[i] = (rand.nextInt(50));
		}
		
		for (int nota : vNotas) {
			System.out.println(nota);
		}

	}
}
