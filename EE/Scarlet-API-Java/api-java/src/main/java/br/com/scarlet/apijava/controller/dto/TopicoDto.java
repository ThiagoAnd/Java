package br.com.scarlet.apijava.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.scarlet.apijava.modelos.Curso;
import br.com.scarlet.apijava.modelos.Topico;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TopicoDto {
	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}

	
	private long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	
	public static List<TopicoDto> converterTopico(List<Topico> topicos){
		//Para não precisar fazer um loop na conversão utilizamos a biblioteca Stream do java 8 e o map
		//O codigo topicoDto :: new chama o proprio topico 
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	}
	
}
