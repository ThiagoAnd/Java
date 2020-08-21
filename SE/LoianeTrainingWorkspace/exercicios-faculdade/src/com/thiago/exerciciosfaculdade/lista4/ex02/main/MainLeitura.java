package com.thiago.exerciciosfaculdade.lista4.ex02.main;

import com.thiago.exerciciosfaculdade.lista4.ex02.exception.NomeInvalidoException;
import com.thiago.exerciciosfaculdade.lista4.ex02.servicos.LeituraDeNome;

public class MainLeitura {

	public static void main(String[] args) {
		try {
			(new LeituraDeNome()).lerNome();
		} catch (NomeInvalidoException e) {
			e.exibirExcecao();
			e.printStackTrace();
		}
	}

}
