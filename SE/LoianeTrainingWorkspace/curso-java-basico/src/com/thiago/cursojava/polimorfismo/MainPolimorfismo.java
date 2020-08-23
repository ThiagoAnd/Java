package com.thiago.cursojava.polimorfismo;

public class MainPolimorfismo {

	public static void main(String[] args) {
		// Polimorfismo envolve sobrecarga de metodo

		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		System.out.println(pessoa.retornaInformacao());
		System.out.println(aluno.retornaInformacao());
		System.out.println(professor.retornaInformacao());
		
		
	}

}
