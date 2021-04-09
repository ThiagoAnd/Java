package br.com.scarlet.apijava.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.scarlet.apijava.modelos.Curso;
import br.com.scarlet.apijava.modelos.Topico;
import br.com.scarlet.apijava.repository.CursoRepository;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class TopicoRequest {
	
	private String titulo;
	private String mensagem;
	private String nomeCurso;
	
	
	
	public Topico converter(CursoRepository cursoRepository) {
		
		//Esse nomeCurso se não me engano não vem de parametro, vem la do controller que recebe um TopicoRequest, e
		//dentro do topicoRequest verificamos que tem o atributo nomeCurso, então ele pega assim essa variavel
		Curso curso = cursoRepository.findByNome(nomeCurso);
		
		return new Topico(titulo,mensagem,curso);
		
	}

}