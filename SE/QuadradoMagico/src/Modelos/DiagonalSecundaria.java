package Modelos;

import Exceptions.VerificacaoDiagonalSecundariaException;
import Exceptions.VerificacaoException;
import Servicos.ServicoVerificadorElementos;

public class DiagonalSecundaria implements ServicoVerificadorElementos {

	@Override
	public int verificar(int somaDesejada, int ordem, int[][] matriz) throws VerificacaoException {
		try {
			int soma = 0;
			System.out.println("\n---------------------------");
			System.out.println("Calculando a diagonal secundaria: \n");
			System.out.print("Soma de : ");
			for (int i = 0; i < ordem; i++) {
				for (int j = 0; j < ordem; j++) {
					if ((i + j) == (ordem - 1)) {
						soma += matriz[i][j];
						System.out.print(" " + matriz[i][j] + "");
					}
				}
			}
			System.out.print(" = " + soma);
			if (soma != somaDesejada) {
				throw new VerificacaoDiagonalSecundariaException();
			}
			return soma;
		} catch (VerificacaoDiagonalSecundariaException e) {
			e.tratarErro();
		}
		return 0;
	}

}
