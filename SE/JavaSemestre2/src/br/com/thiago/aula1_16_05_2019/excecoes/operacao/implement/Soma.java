package br.com.thiago.aula1_16_05_2019.excecoes.operacao.implement;

import br.com.thiago.aula1_16_05_2019.excecoes.operacao.Operacao;
import br.com.thiago.aula1_16_05_2019.excecoes.operacao.exception.OperacaoNaoPermitidaException;

public class Soma implements Operacao {

	@Override
	public float executarOp(int n1, int n2) throws OperacaoNaoPermitidaException{
        return n1+n2;
	}

}
