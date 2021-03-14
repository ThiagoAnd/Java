package com.thiago.cursojava.abstracao.classeabstrata;

public abstract class ClasseAbstrata {
	
	public void testeAbstracaoNome(String nome) {
		System.out.println("Ola "+nome+".Esse print veio da classe abstrata sem a necessidade de implementar");
	}
	
	public abstract void metodoAbstrato();

}
