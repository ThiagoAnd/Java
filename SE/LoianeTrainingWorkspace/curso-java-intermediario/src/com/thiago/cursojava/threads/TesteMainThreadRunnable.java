package com.thiago.cursojava.threads;

public class TesteMainThreadRunnable {

	public static void main(String[] args) {

		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
		//A thread1 mesmo implementando a classe runnable, não chega a ser uma
		//thread, ela simplesmente implementou a classe runnable. Para poder utili
		//zar ela como thread , vc deve instanciar uma thread e passar ela como argumento
		//Thread  t1 = new Thread(thread1);
		//t1.start();
	}

}
