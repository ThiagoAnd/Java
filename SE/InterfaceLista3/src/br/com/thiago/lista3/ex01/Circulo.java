package br.com.thiago.lista3.ex01;

public class Circulo implements FormaGeometrica {

	@Override
	public double calcularArea(double raio) {
		return Math.pow(raio, 2) * Math.PI;
	}

	@Override
	public double calcularPerimetro(double raio) {
		return 2 * raio * Math.PI;
	}

}
