package br.com.thiago.aula1_09_05_2019.interfaces.exemplo1;

public class Jogo implements Promocao{

	@Override
	public void aplicarDesconto(int valor) {
		System.out.println(valor);
	}

}
