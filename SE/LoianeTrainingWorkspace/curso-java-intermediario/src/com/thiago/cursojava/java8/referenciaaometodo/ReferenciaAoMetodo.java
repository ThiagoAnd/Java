package com.thiago.cursojava.java8.referenciaaometodo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReferenciaAoMetodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa("Thiago",25);
		Pessoa p2 = new Pessoa("Erica",26);
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		//pessoas.add(p1);
		//pessoas.add(p2);
		
		pessoas = Arrays.asList(p1,p2);
		
		
		
		
		
		
		
		//Uma forma de fazer um loop
		
		for(Pessoa p : pessoas) {
			System.out.println(p.getNome());
		}
		
		//Outra forma de fazer um loop
		
		//pessoas.forEach(pp -> System.out.println(pp.getIdade()));
		
		
		//Aqui não vai fazer nada na tela, mas para cada pessoa vc pega o nome dela
		//implementar alguma coisa depois, mas esse é o referencia ao metodo
		//pessoas.forEach(Pessoa::getNome);
		
		//Esse da certo
	//pessoas.forEach(x -> x.setNome(""));
		
		//pessoas = pessoas.stream().map(Pessoa::novaPessoa).collect(Collectors.toList());
		
		for(Pessoa p : pessoas) {
		//	System.out.println(p.getNome());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
