package com.thiago.cursojava.threads;

public class MinhaThread extends Thread {

	private String nome;
	private int tempo;

	public MinhaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}

	// Este metodo abaixo se refere ao metodo start() de uma thread
	public void run() {

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contador " + i);
				sleep(tempo);
			}
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nome+" terminou a execução");//Aqui a thread termina e fica em estado dead()

	}

}
