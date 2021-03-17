package com.collectiongenerics.thiago.genericmethods;

public class BoundedTypeParameters {
	
	//Algumas vezes queremos limitar o tip que uma variavel ira ter mas ainda assim queremos usar o generics
	//Para uma conta de matematica não podemos usar String mas podemos usar int e double
	//O extends Comparable<T> é usado para setar a limitação, vc pode usar ou não, então pode deixar na assinatura mesmo
	//Esse extends  não é o retorno, o retorno é o T que esta depois de tudo isso
	public static <T extends Comparable<T>> T calcularOMinimo(T t1, T t2) {
		// < 0 significa que T1 é menor que T2
		if(t1.compareTo(t2)<0) {
			return t1;
		}
		return t2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(calcularOMinimo('v', 'h'));
		System.out.println(calcularOMinimo("Thiago", "Erica"));
		System.out.println(calcularOMinimo(100,23));
		
		Integer
	}

}
