package br.com.scarlet.apijava.service;

import br.com.scarlet.apijava.dto.TopicoRequest;
import br.com.scarlet.apijava.dto.TopicoResponse;
import br.com.scarlet.apijava.modelos.Topico;

public interface TopicoService {
	
	
Topico cadastrar(TopicoRequest topicoRequest);

TopicoResponse atualizarTopico(Long id, TopicoRequest topicoRequest);


}
