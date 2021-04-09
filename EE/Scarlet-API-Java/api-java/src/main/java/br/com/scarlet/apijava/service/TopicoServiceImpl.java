package br.com.scarlet.apijava.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.util.JSONPObject;

import br.com.scarlet.apijava.dto.TopicoRequest;
import br.com.scarlet.apijava.dto.TopicoResponse;
import br.com.scarlet.apijava.modelos.Topico;
import br.com.scarlet.apijava.repository.CursoRepository;
import br.com.scarlet.apijava.repository.TopicoRepository;

@Service
public class TopicoServiceImpl implements TopicoService {

	@Autowired
	private TopicoRepository topicoRepository;

	@Autowired
	private CursoRepository cursoRepository;

	@Override
	public Topico cadastrar(TopicoRequest topicoRequest) {

		Topico topico = topicoRequest.converter(cursoRepository);
		topicoRepository.save(topico);
		// TODO Auto-generated method stub
		return topico;
	}

	@Override
	public TopicoResponse atualizarTopico(Long id, TopicoRequest topicoRequest) {

		Topico topico = topicoRepository.getOne(id);
		topico.setTitulo(topicoRequest.getTitulo());
		topico.setMensagem(topicoRequest.getMensagem());

		// TODO Auto-generated method stub
		return new TopicoResponse(topico);
	}

	public ResponseEntity<Object> deletar(Long id) {

		// Para ficar melhor vamos usar o findbyId antes de deletar, pois pode não achar
		// e se não achar pra deletar ele da uma exception
		// Para usar o findbyid temos que utilizar a tipo Optional do java 8, pois como
		// o nome diz, pode ter retorno ou pode não ter, vai que ja deletamos?
		Optional<Topico> topico = topicoRepository.findById(id);

		if (topico.isPresent()) {
			topicoRepository.deleteById(id);

			return ResponseEntity.ok().build();

		}
		
		HashMap<String, String> body = new HashMap<String, String>();
		body.put("Mensagem", "Não existe o id para deletar");
	   

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(body);

	}

}
