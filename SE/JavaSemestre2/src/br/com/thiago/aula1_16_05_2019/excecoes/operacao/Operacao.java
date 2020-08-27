package br.com.thiago.aula1_16_05_2019.excecoes.operacao;

import br.com.thiago.aula1_16_05_2019.excecoes.operacao.exception.OperacaoNaoPermitidaException;

public interface Operacao {
	float executarOp(int n1, int n2) throws OperacaoNaoPermitidaException;
}
