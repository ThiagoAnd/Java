package com.thiago.cursojava.abstracao.classeabstrata;

public class Main {

	public static void main(String[] args) {
		// TODO Ainda não achei uma diferença forte, metodos implementados
		// na classe super normal ou abstract podem ser usados na classe filha
		//O que eu vi é que se criar um metodo abstract, ele devera ser implementado na classe filha
		//igual com o que acontece na interface.

		ClasseFilha cfilha = new ClasseFilha();
		
		cfilha.testeAbstracaoNome("Thiago");
		
		ClasseSuperSemAbstract cfilhaSem = new ClasseSuperSemAbstract();
		
		cfilhaSem.testeMetodoSuper();
		
		
	}

}
