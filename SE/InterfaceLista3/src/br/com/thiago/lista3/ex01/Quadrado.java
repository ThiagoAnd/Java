package br.com.thiago.lista3.ex01;

public class Quadrado implements FormaGeometrica{

	@Override
	public double calcularArea(double lado) {
		return Math.pow(lado,2);
	}

	@Override
	public double calcularPerimetro(double lado) {
		return lado*4;
	}

}
