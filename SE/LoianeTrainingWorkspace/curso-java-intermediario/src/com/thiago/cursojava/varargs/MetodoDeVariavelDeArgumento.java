package com.thiago.cursojava.varargs;

public class MetodoDeVariavelDeArgumento {

	public static void main(String[] args) {
		
		
		metodoDeArgumento(4,8,4,25,74);
	
}
	
	public static void metodoDeArgumento(int...numeros) {
		
		System.out.println("Length: "+numeros.length);
		System.out.println("Posição [1]: "+numeros[1]);
	};
}

