package br.com.thiago.aula1_16_05_2019.excecoes.operacao.main;

import br.com.thiago.aula1_16_05_2019.excecoes.operacao.Operacao;
import br.com.thiago.aula1_16_05_2019.excecoes.operacao.exception.OperacaoNaoPermitidaException;
import br.com.thiago.aula1_16_05_2019.excecoes.operacao.implement.Divisao;
import br.com.thiago.aula1_16_05_2019.excecoes.operacao.implement.Soma;

public class Main {

	public static void main(String[] args) {
		/*Operacao soma = new Soma();
		System.out.println(soma.executarOp(2, 2));
		*/
		Operacao divisao = new Divisao();
		try {
			System.out.println(divisao.executarOp(10, 0));
		} catch (OperacaoNaoPermitidaException e) {
			e.printStackTrace();
			System.out.println(e.exibirCausaDaExcecao());
		}
	}

}
