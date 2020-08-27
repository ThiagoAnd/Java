package br.com.thiago.lista3.ex02;

import br.com.thiago.lista3.ex02.servicos.Operacoes;

public class MainCalculadora {

	public static void main(String[] args) {
		Operacoes soma = new Soma();
		soma.calcular(8, 10);
		
		Operacoes subtracao = new Subtracao();
		subtracao.calcular(27, 10);
		
		Operacoes multiplicacao = new Multiplicacao();
		multiplicacao.calcular(27, 10);
		
		Operacoes divisao = new Divisao();
		divisao.calcular(8, 2);
		
	}

}
