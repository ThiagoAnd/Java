package Modelos;

import Exceptions.VerificacaoColunaException;
import Exceptions.VerificacaoException;
import Servicos.ServicoVerificadorElementos;

public class Colunas implements ServicoVerificadorElementos {

	@Override
	public int verificar(int somaDesejada, int ordem, int[][] matriz) throws VerificacaoException {
		try {
			int soma = 0;
			System.out.println("\n---------------------------");
			System.out.println("Calculando as colunas: \n");
			for (int j = 0; j < ordem; j++) {
				soma = 0;
				System.out.print("Soma de : ");
				for (int i = 0; i < ordem; i++) {
					soma += matriz[i][j];
					System.out.print(" " + matriz[i][j] + "");
				}
				System.out.print(" = " + soma);
				if (soma != somaDesejada) {
					throw new VerificacaoColunaException();
				}
				System.out.println("\n");
			}
			return soma;
		} catch (VerificacaoColunaException e) {
			e.tratarErro();
		}
		return 0;
	}

}
