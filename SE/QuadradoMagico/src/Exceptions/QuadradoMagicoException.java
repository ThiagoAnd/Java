package Exceptions;

public class QuadradoMagicoException extends Exception {
	public void tratarErro() {
		System.out.println("\n------------------------------\nO quadrado não forma um quadrado magico");
	}
}
