package Servicos;

import Exceptions.QuadradoMagicoException;

public class ServicoVerificadorQuadradoMagico {

	public void compararValores(int linha, int coluna, int diagonalPrincipal, int diagonalSecundaria, int constante)
			throws QuadradoMagicoException {

		try {
			if ((linha == coluna) && (coluna == diagonalPrincipal) && (diagonalPrincipal == diagonalSecundaria)
					&& (diagonalSecundaria == constante)) {
				System.out.println("\n------------------------------\nO quadrado forma um quadrado magico");
			} else {
				throw new QuadradoMagicoException();
			}
		} catch (QuadradoMagicoException e) {
			e.tratarErro();
			e.printStackTrace();
		}
	};

}
