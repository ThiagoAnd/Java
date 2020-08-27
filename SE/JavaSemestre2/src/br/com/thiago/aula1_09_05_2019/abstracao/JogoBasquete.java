package br.com.thiago.aula1_09_05_2019.abstracao;

public class JogoBasquete extends Jogo{

	@Override
	public void exibirTecnicoPrincipal() {
System.out.println("O tecnico principal é: Vanderley Luxenburgo");		
	}

	@Override
	public void exibirAuxiliarTecnico(String nome) {
		System.out.println("O tecnico auxiliar é: "+nome);			
	}

	@Override
	public String exibirTecnicoSubstituto(String nome) {	
		return nome;
	}
	

}
