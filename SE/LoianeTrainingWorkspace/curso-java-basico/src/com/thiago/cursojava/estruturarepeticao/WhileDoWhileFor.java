package com.thiago.cursojava.estruturarepeticao;

import java.util.ArrayList;
import java.util.List;

public class WhileDoWhileFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 1;

		/* WHILE */

		while (numero <= 5) {
			System.out.println("Numero " + numero);
			numero += 1;
		}
		
		System.out.println("\n");
		/* DO WHILE */
		
		do {
			System.out.println("O numero eh " + numero);
			numero += 1;
		} while (numero < 5);
		
		System.out.println("\n");
		/* FOR */
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("iteracao " + i);
		}
		
		System.out.println("\n");
		/*FOR EACH*/
		
		List<String> cidades = new ArrayList<String>();
		cidades.add("Curitiba");
		cidades.add("São Paulo");
		cidades.add("Rio de Janeiro");
		 
		for (String cidade : cidades) {
		    if(cidade.equals("São Paulo")){
		        cidades.remove(cidade);
		    }
		}
		
		System.out.println(cidades);
		
		

	}

}
