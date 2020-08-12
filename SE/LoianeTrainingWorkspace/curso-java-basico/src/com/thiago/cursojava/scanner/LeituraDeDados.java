package com.thiago.cursojava.scanner;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = scan.nextLine();
		System.out.println("O seu nome eh " + nome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("A sua idade eh " + idade);
		
		System.out.println("Digite o seu peso: ");
		double peso = scan.nextDouble();
		System.out.println("O seu peso eh " + peso);
		
		
	}

}
