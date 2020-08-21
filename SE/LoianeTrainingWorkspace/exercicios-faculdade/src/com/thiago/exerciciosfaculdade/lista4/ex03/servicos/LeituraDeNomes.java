package com.thiago.exerciciosfaculdade.lista4.ex03.servicos;

import java.util.Scanner;

import com.thiago.exerciciosfaculdade.lista4.ex03.exception.NomeInvalidoException;

public class LeituraDeNomes {
	public void lerNomes() throws NomeInvalidoException {
		String[] vNomes = new String[5];
		Scanner scan = new Scanner(System.in);
		
		int qtdCorretos = 0;
		int qtdIncorretos = 0;
		for (int i = 0; i < vNomes.length; i++) {
			try {
				System.out.print("Digite o " + (i + 1) + " nome: ");
				vNomes[i] = scan.nextLine();
				if (vNomes[i].startsWith("_")) {
					throw new NomeInvalidoException();
				}
				qtdCorretos += 1;
			} catch (NomeInvalidoException e) {
				qtdIncorretos=e.contagemDeErros(qtdIncorretos);
				/*ou qtdErrados+=1;*/
			}
		}
		System.out.println("Quantidade de nomes corretos = "+qtdCorretos);
		System.out.println("Quantidade de nomes incorretos = "+qtdIncorretos);
	}

}
