package Exceptions;

public class VerificacaoColunaException extends VerificacaoException {
	
	public void tratarErro() {
		System.out.print(" -> Soma das colunas não corresponde à constante magica. Retornando...");

	}

}
