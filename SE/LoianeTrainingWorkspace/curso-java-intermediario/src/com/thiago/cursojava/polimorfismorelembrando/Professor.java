package com.thiago.cursojava.polimorfismorelembrando;

public class Professor extends Pessoa {
	
	public Professor(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
	}

	public Professor() {}
	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	private Double Salario;
	
	
	public String sobre() {
		return "Sou professor";
	}

}
