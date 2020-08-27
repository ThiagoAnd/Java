package Exceptions;

public class VerificacaoException extends Exception {
	public void tratarErro() {
		System.out.println("\nSoma não corresponde à constante magica");
	}
}
