package com.thiago.exerciciosfaculdade.lista4.ex04;

import java.util.Scanner;

public class MainTriangulo {

	public static void main(String[] args) {
		try {
			(new Leitura()).verificarTriangulo();

		} catch (ArestasInvalidasException e) {
			e.exibirCausa();
			e.printStackTrace();
		}
	}

}
