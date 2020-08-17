package com.thiago.cursojava.classecarro;

public class MainCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro fiat = new Carro();

		fiat.modelo = "Uno";
		fiat.ano = 1997;
		fiat.tanque = 55.8;

		double valor = Math.round(fiat.valorTanque(fiat.tanque, 2.99));
		System.out.println("Carro: " + fiat.modelo);
		System.out.println("Ano: " + 1997);
		System.out.println("Capacidade em litros: " + fiat.tanque);
		System.out.println("Para encher um tanque é necessario R$" + valor + " reais");
	}

}
