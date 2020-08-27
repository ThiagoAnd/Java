package br.com.thiago.aula1_16_05_2019.excecoes.operacao.implement;

import java.util.Scanner;

import br.com.thiago.aula1_16_05_2019.excecoes.operacao.Operacao;
import br.com.thiago.aula1_16_05_2019.excecoes.operacao.exception.OperacaoNaoPermitidaException;

public class Divisao implements Operacao {

	@Override
	public float executarOp(int n1, int n2) throws OperacaoNaoPermitidaException {
		try {
			return n1 / n2;
		} catch (ArithmeticException abacate) {
			System.out.println("Não é permitido divisao por zero");
			/*
			 * System.out.println("O problema ocorrido foi: "+abacate.getMessage());
			 */
			Scanner scan = new Scanner(System.in);
			int contador = 0;
			do {
				System.out.println("Digite o segundo numero novamente");
				n2 = scan.nextInt();
				contador++;
				if (contador == 10) {
					throw new OperacaoNaoPermitidaException(
							"SEU VERME, 10 vezes e ainda não entendeu MISERÁVEL ? Eu se fosse você nunca mais tentaria utilizar a minha aplicação na sua vida, se você tentar eu te reduzirei a pó", "Marcelo");
				}
			} while (n2 == 0);
			return n1 / n2;
			/*
			 * Imprimindo a pilha de rastreio abacate.printStackTrace();
			 */

		}

	}
}
