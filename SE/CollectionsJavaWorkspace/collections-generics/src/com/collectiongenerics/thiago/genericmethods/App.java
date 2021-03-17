package com.collectiongenerics.thiago.genericmethods;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GenericMethod genericMethod = new GenericMethod();
//		 genericMethod.showItem("Hello worldddd");
//		 genericMethod.showItem('H');
//		 genericMethod.showItem(13213);
//		 genericMethod.showItem(85.45);
//		 
//		 System.out.println("O retorno é: "+genericMethod.showItemReturn(654654654));
		 
		 Integer[] arrayInt = {3,4,5,2,1};
		 String[] nomes = {"Thiago","Erica","Bruno","Jessica"};
		 
		 genericMethod.showArray(arrayInt);
		 System.out.println("");
		 genericMethod.showArray(nomes);
		 
	}

}
