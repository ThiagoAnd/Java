package br.com.thiago.lista3.ex01;

import java.text.DecimalFormat;

public class MainFormaGeometrica {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.0");

		FormaGeometrica quadrado = new Quadrado();		
		System.out.println("A area do quadrado é: " + quadrado.calcularArea(7));
		System.out.println("O perimetro do quadrado é: " + df.format(quadrado.calcularPerimetro(7)));

		FormaGeometrica circulo = new Circulo();
		System.out.println("\n\nA area do circulo é: " + circulo.calcularArea(5));
		System.out.println("O perimetro do circulo é: " + df.format(circulo.calcularPerimetro(5)));
		

	}

}
