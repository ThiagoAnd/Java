package br.com.thiago.aula1_16_05_2019.excecoes.operacao.exception;

public class OperacaoNaoPermitidaException extends Exception {

	private String nome;
	
	public String getNome() {
		return nome;
	}

	public OperacaoNaoPermitidaException() {
		super();
	}

	public OperacaoNaoPermitidaException(String mensagem) {
		super(mensagem);
	}
	
	public OperacaoNaoPermitidaException(String mensagem, String nome) {
		super(mensagem);
		this.nome = nome;
	}
	
	public String exibirCausaDaExcecao() {
		return "A exceceção foi gerada pelo nome: " + nome;
	}


}
