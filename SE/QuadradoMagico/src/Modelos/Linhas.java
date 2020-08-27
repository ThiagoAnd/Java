package Modelos;

import Exceptions.VerificacaoException;
import Exceptions.VerificacaoLinhaException;
import Servicos.ServicoVerificadorElementos;

public class Linhas implements ServicoVerificadorElementos {

	@Override
	public int verificar(int somaDesejada, int ordem, int[][] matriz) throws VerificacaoException {
		try {
			int soma = 0;
			System.out.println("\n---------------------------");
			System.out.println("Calculando as linhas: \n");
			for (int i = 0; i < ordem; i++) {
				soma = 0;
				System.out.print("Soma de : ");
				for (int j = 0; j < ordem; j++) {
					soma += matriz[i][j];
					System.out.print(" "+matriz[i][j]+"");
				}
				System.out.print(" = " + soma);
				if (soma != somaDesejada) {
					throw new VerificacaoLinhaException();
				}
				System.out.println("\n");
			}
			return soma;
		} catch (VerificacaoLinhaException e) {
			e.tratarErro();
		}
		return 0;
	}// method ends

}
