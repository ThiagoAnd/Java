package Util;

import Exceptions.QuadradoMagicoException;
import Exceptions.VerificacaoException;
import Modelos.Colunas;
import Modelos.DiagonalPrincipal;
import Modelos.DiagonalSecundaria;
import Modelos.Linhas;
import Servicos.ServicoVerificadorElementos;
import Servicos.ServicoVerificadorQuadradoMagico;

public class Menu {

	public void etapas() throws VerificacaoException, QuadradoMagicoException {
		Util utilidade = new Util();

		int ordem = utilidade.getOrdem("\nDigite a ordem da matriz: ");
		int constante = utilidade.magicConstant(ordem);
		int[][] matriz = utilidade.getMatrix("", ordem);

		System.out.println("\nOrdem da matriz = " + ordem);
		System.out.println("Constante magica = " + constante);
		utilidade.showMatrix(matriz, ordem);

		ServicoVerificadorElementos dados = new Linhas();
		int somaLinhas = dados.verificar(constante, ordem, matriz);

		dados = new Colunas();
		int somaColunas = dados.verificar(constante, ordem, matriz);

		dados = new DiagonalPrincipal();
		int somaDiagPrincipal = dados.verificar(constante, ordem, matriz);

		dados = new DiagonalSecundaria();
		int somaDiagSecundaria = dados.verificar(constante, ordem, matriz);

		(new ServicoVerificadorQuadradoMagico()).compararValores(somaLinhas, somaColunas, somaDiagPrincipal,
				somaDiagSecundaria, constante);
	}
}
