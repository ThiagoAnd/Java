package com.thiago.cursojava.java8.referenciaaometodo;

import java.util.List;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa() {
		this.nome ="testando nome";
		this.idade = 999;
	};
	
	public Pessoa (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public  Pessoa novaPessoa(Pessoa p) {
		p.setNome("Girino");
		return p;
	}
	
	public Pessoa novaLista(Pessoa p) {
		return null;
	}

}
