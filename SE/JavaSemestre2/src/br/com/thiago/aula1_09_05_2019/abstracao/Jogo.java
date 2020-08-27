package br.com.thiago.aula1_09_05_2019.abstracao;

import java.util.Date;

public abstract class Jogo {
	
	protected Date data;
	protected String hora;
	protected String local;
public Jogo() {
	
	System.out.println("===Informações do jogo===");
}
	public abstract void exibirTecnicoPrincipal();
	public abstract void exibirAuxiliarTecnico(String nome);
	public abstract String exibirTecnicoSubstituto(String nome);;

}
