package com.thiago.cursojava.polimorfismorelembrando;

public class Aluno extends Pessoa{
	
	public Aluno(String nome, String endereco, String telefone,String curso) {
		super(nome, endereco, telefone);
		// TODO Auto-generated constructor stub
		this.curso=curso;
	}
	
	public Aluno() {}

	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String sobre() {
		// TODO Auto-generated method stub
		return null;
	}

	/*public String sobre() {
		return "Sou aluno";
	}*/
	

}
