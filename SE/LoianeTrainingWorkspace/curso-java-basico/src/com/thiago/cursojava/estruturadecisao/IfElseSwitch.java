package com.thiago.cursojava.estruturadecisao;

public class IfElseSwitch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 11;

		if (numero == 10) {
			System.out.println("O numero eh 10");

		} else if (numero == 11) {
			System.out.println("O numero eh 11");

		} else {
			System.out.println("O numero nao eh 10 nem 11");

		}

		
		/*Controle de decisao multipla*/
		
		String variavel = "Java";

		switch (variavel) {

		case "Python":
			System.out.println("Eh Python");
			break;
		case "PHP":
			System.out.println("Eh PHP");
			break;
		case "Java":
			System.out.println("Eh Java");
			break;
		default:
			System.out.println("Nao eh nenhuma das opcoes");
			break;

		}

	}

}
