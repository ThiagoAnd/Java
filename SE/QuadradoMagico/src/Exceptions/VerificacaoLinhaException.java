package Exceptions;

public class VerificacaoLinhaException extends VerificacaoException {

	public void tratarErro() {
		System.out.print(" -> Soma das linhas não corresponde à constante magica. Retornando...");

	}
}
