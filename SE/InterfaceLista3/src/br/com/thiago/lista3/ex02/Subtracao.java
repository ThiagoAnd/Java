package br.com.thiago.lista3.ex02;

import br.com.thiago.lista3.ex02.servicos.Operacoes;

public class Subtracao implements Operacoes{

	@Override
	public void calcular(double n1, double n2) {
		System.out.println("\nA subtracao de "+n1+" com "+n2+" é: "+(n1-n2));
	}

}
