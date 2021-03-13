package com.thiago.cursojava.arrays;

public class Main {

	public static void main(String[] args) {
	
		String[] teste = new String[2];
		
		teste[1] = "asdf";
		teste[0]= "wwww";
		
		for(String x : teste) {
			System.out.println(x);
			
		}
		
		char[][] quadrado = new char[3][2];
		
		for(int i=0;i<quadrado.length;i++) {
			System.out.println("Valor i: "+i);
			
			for(int j = 0;j<quadrado[i].length;j++) {
				System.out.println(j);
			}
			System.out.println("\n");
		}
		
		String[] p = new String[5];
		System.out.println(p[2]);
		
		
		
		
		
	}
}
