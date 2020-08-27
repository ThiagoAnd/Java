package br.com.thiago.lista3.ex02;

import br.com.thiago.lista3.ex02.servicos.Operacoes;

public class Divisao implements Operacoes {

	@Override
	public void calcular(double n1, double n2) {
		if (n2 == 0) {
			System.out.println("\nNão existe resultado pois não pode dividir por zero");
			System.exit(0);
		}
		System.out.println("\nA divisão de "+n1+" com "+n2+" é: "+(n1/n2));
	}

}
