package Modelos;

import Exceptions.VerificacaoDiagonalPrincipalException;
import Exceptions.VerificacaoException;
import Servicos.ServicoVerificadorElementos;

public class DiagonalPrincipal implements ServicoVerificadorElementos {

	@Override
	public int verificar(int somaDesejada, int ordem, int[][] matriz) throws VerificacaoException {
		try {
			int soma = 0;
			System.out.println("\n---------------------------");
			System.out.println("Calculando a diagonal principal: \n");
			System.out.print("Soma de : ");
			for (int i = 0; i < ordem; i++) {
				for (int j = 0; j < ordem; j++) {
					if (i == j) {
						soma += matriz[i][j];
						System.out.print(" " + matriz[i][j] + "");
					}
				}
			}
			System.out.print(" = " + soma);
			if (soma != somaDesejada) {
				throw new VerificacaoDiagonalPrincipalException();
			}
			return soma;
		} catch (VerificacaoDiagonalPrincipalException e) {
			e.tratarErro();
		}
		return 0;
	}

}
