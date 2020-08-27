package br.com.thiago.aula1_09_05_2019.interfaces.exemplo1;

public interface Promocao {

	void aplicarDesconto(int valor);

	default void aplicarDescontoPadrao() {
			aplicarDesconto(5);
	}
}
