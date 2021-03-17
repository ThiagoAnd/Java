package com.collectiongenerics.thiago.basics;

class LojaSemGenerics{
	
	private Object item;
	
	public void setItem(Object item) {
		this.item = item;
	}
	
	public Object getItem() {
		return this.item;
	}
	
	@Override
	public String toString() {
		return "Teste de toString, acredito que é so fazer sysout na classe, não precisa colocar toString";
	}
}

//Com generics. Usa o T para especificar que só é um TIPO, que não sabemos o que vamos guardar

class LojaComGenerics<T>{
	
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return this.item;
	}
}

//Classe principal
public class Exemplo2 {

	public static void main(String[] args) {
	
		//Sem generics
		LojaSemGenerics loja = new LojaSemGenerics();
		loja.setItem(45);
		Integer item = (Integer) loja.getItem();// Modo ruim
		System.out.println(item);
		
		
		//Com generics, ainda não entendi, tipo temos que setar de qualquer forma, a unica coisa que valeria a pena
		//É por ter falado que fazer um casting é mais custoso
		LojaComGenerics<String> loja2 = new LojaComGenerics<>();//diamond operator
		loja2.setItem("hello world");
		String item2 = loja2.getItem();
		System.out.println(item2);
		
		System.out.println(loja);
		
			

	}
	


}


