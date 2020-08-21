package com.thiago.exerciciosfaculdade.lista4.ex04;

import java.util.Scanner;

public class Leitura {
	Scanner scan = new Scanner(System.in);

	public boolean calcularArestas(int n1, int n2, int n3) {
		// desigualdade triangular
		if ((n1 + n2 > n3) && (n2 + n3 > n1) && (n3 + n1 > n2)) {
			if ((n1 == n2) && (n2 == n3)) {
				System.out.println("\nO triangulo é equilatero");
			} else if ((n1 != n2) && (n1 != n3) && (n2 != n3)) {
				System.out.println("\nO triangulo é escaleno");
			} else {
				if (((n1 == n2) || (n2 == n3) || (n1 == n3))) {
					System.out.println("\nO triangulo é isosceles");
				}
				double hipotenusa = 0;
				double lado1 = 0, lado2 = 0;
				if ((n1 > n2) && (n1 > n3)) {
					hipotenusa = n1;
					lado1 = n2;
					lado2 = n3;
				} else if ((n2 > n1) && (n2 > n3)) {
					hipotenusa = n2;
					lado1 = n1;
					lado2 = n3;
				} else if ((n3 > n1) && (n3 > n2)) {
					hipotenusa = n3;
					lado1 = n1;
					lado2 = n2;
				}
				if ((hipotenusa != 0) && (lado1 != 0) && (lado2 != 0)) {
					if ((Math.round(
							Math.pow(hipotenusa, 2)) == (Math.round((Math.pow(lado1, 2) + (Math.pow(lado2, 2))))))) {
						System.out.println("\nO triangulo é retangulo");
					}
				}
			}
			return true;
		}
		return false;
	}

	public void verificarTriangulo() throws ArestasInvalidasException {

		// Regra: a medida da HI de um triangulo retangulo isosceles é igual a um lado
		// vezes raiz de 2
		// Usar double: 5,65(4 * raiz de 2 que é 1,41) para hipotenusa e 4 para os lados
		System.out.print("Digite o primeiro numero: ");
		int n1 = scan.nextInt();
		System.out.print("Digite o segundo numero: ");
		int n2 = scan.nextInt();
		System.out.print("Digite o terceiro numero: ");
		int n3 = scan.nextInt();

		if (!calcularArestas(n1, n2, n3)) {
			throw new ArestasInvalidasException();
		}

	}
}
