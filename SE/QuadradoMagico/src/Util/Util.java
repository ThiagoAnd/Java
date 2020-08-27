package Util;

import java.util.Scanner;

public class Util {

	Scanner scan = new Scanner(System.in);

	public int getOrdem(String mensagem) {
		int ordem = 0;

		do {
			System.out.print(mensagem);
			ordem = scan.nextInt();
			if (ordem < 3) {
				System.out.println("A ordem da matriz precisa ser maior ou igual a 3");
			}
		} while (ordem < 3);

		return ordem;
	}

	public int[][] getMatrix(String mensagem, int ordem) {

		int[][] matriz = new int[ordem][ordem];
		System.out.println(mensagem + "\n");

		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				System.out.print("Digite o valor do elemento [ " + i + " ] [ " + j + " ] :");
				matriz[i][j] = scan.nextInt();
			}
		}
		return matriz;
	}

	public void showMatrix(int[][] matriz, int ordem) {
		System.out.println("\nMatriz criada:");
		for (int i = 0; i < ordem; i++) {
			for (int j = 0; j < ordem; j++) {
				System.out.print(matriz[i][j] + "  ");

			}
			System.out.println("");
		}

	}

	public int magicConstant(int ordem) {
		return (int) (ordem * (Math.pow(ordem, 2) + 1) / 2);
	}
}
