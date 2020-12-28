package com.thiago.cursojava.threads;

public class TesteMainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Foi criado 2 threads, e são executadas ao mesmo tempo mas são mostradas em tempos diferentes,
		//de acordo com os millisegundos
		MinhaThread thread = new MinhaThread("Thread #1",600);
		//thread.start(); //Executa o metodo run
		
		MinhaThread thread2 = new MinhaThread("Thread #2",900);
	}

}
