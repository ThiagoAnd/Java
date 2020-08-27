package br.com.thiago.aula1_09_05_2019.interfaces.exemplo2;

public class Quadrado implements FormaGeometrica {

	@Override
	public void calcularArea(double dado) {
		System.out.println("A area é: "+Math.pow(dado, 2));
	}

}
