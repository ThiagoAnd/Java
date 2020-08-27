package Exceptions;

public class VerificacaoDiagonalPrincipalException extends VerificacaoException {
	public void tratarErro() {
		System.out.print(" -> Soma da diagonal principal não corresponde à constante magica. Retornando...");

	}
}
