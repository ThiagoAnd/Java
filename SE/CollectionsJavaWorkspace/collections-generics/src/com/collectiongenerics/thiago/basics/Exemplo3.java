package com.collectiongenerics.thiago.basics;

class Hashtable <K,V>{
	
	private K chave;
	private V valor;
	
	public Hashtable(K chave,V valor) {
		this.chave = chave;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return chave.toString()+" - "+valor.toString();
	}
	
}
//Multiplos parametros com generics
public class Exemplo3 {

	public static void main(String[] args) {
	
	Hashtable<String,Integer> hash = new Hashtable("Testando chave", 999);
	System.out.println(hash);
		
			

	}
	


}


