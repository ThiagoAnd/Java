package com.thiago.cursojava.multiplasexcecoes;

public class MultiplasExcecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numerador = { 4, 8, 12, 16, 20 };
		int[] denominador = { 2, 0, 4, 8 };

		for (int i = 0; i < numerador.length; i++) {
			try {
				System.out.println(numerador[i] + " / " + denominador[i] + " = " + (numerador[i] / denominador[i]));

			} catch (ArithmeticException e) {

				System.out.println("Não pode dividir por zero");

			}catch (ArrayIndexOutOfBoundsException e2) {
				
				System.out.println("Chegou ao limite do array");
				
			}

		}
		
		System.out.println(" Outro modo de fazer:\n");
		
		for (int i = 0; i < numerador.length; i++) {
			try {
				System.out.println(numerador[i] + " / " + denominador[i] + " = " + (numerador[i] / denominador[i]));

			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {

				System.out.println("Ocorreu um erro");

			}

		}

	}

}
