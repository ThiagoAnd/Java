package com.collectiongenerics.thiago.genericmethods;

public class GenericMethod {

	public<T> void showItem(T t) {
		System.out.println("O item é : "+t.toString());
	} 
	
	public<T> T showItemReturn(T t) {
		System.out.println("O item é : "+t.toString());
		
		return t;
	} 
	
	public<T> void showArray(T[] array) {
		
		for(T item : array) {
			System.out.print(item.toString()+" -> ");
		}
		
	} 
	
}
