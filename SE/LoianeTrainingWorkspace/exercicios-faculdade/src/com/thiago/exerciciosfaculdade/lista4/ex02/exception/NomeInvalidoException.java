package com.thiago.exerciciosfaculdade.lista4.ex02.exception;

public class NomeInvalidoException extends Exception {

	private String nome;

	public NomeInvalidoException(String nome) {
		this.nome = nome;
	}

	public void exibirExcecao() {
		System.out.println("A excecao foi gerada pelo nome: " + nome);
	}

}
