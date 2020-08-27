package br.com.thiago.aula1_09_05_2019.abstracao;

public class Main {

	public static void main(String[] args) {
		Jogo jogoBasquete = new JogoBasquete();
		jogoBasquete.exibirTecnicoPrincipal();
		jogoBasquete.exibirAuxiliarTecnico("Rincon");
		System.out.println("O tecnico substituto é: "+jogoBasquete.exibirTecnicoSubstituto("Gilberto"));
		
	}

}
