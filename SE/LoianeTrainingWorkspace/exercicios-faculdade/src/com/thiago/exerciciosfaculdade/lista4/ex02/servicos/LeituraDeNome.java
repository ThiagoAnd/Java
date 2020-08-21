package com.thiago.exerciciosfaculdade.lista4.ex02.servicos;

import java.util.Scanner;

import com.thiago.exerciciosfaculdade.lista4.ex02.exception.NomeInvalidoException;

public class LeituraDeNome {

	public void lerNome() throws NomeInvalidoException {

		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um nome: ");
		String nome = scan.nextLine();

		if (nome.startsWith("_")) {
			throw new NomeInvalidoException(nome);
		}else {
			System.out.println("\nO nome esta de acordo");
		}
	}
}
