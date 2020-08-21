package com.thiago.exerciciosfaculdade.lista4.ex03.main;

import com.thiago.exerciciosfaculdade.lista4.ex03.exception.NomeInvalidoException;
import com.thiago.exerciciosfaculdade.lista4.ex03.servicos.LeituraDeNomes;

public class Main3 {

	public static void main(String[] args) throws NomeInvalidoException  {
		
		(new LeituraDeNomes()).lerNomes();
		
	}
}
