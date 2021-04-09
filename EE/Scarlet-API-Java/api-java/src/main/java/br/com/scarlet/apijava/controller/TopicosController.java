package br.com.scarlet.apijava.controller;

import br.com.scarlet.apijava.controller.dto.TopicoDto;
import br.com.scarlet.apijava.dto.ErrorApi;
import br.com.scarlet.apijava.dto.TopicoRequest;
import br.com.scarlet.apijava.dto.TopicoResponse;
import br.com.scarlet.apijava.modelos.Topico;
import br.com.scarlet.apijava.repository.CursoRepository;
import br.com.scarlet.apijava.repository.TopicoRepository;
import br.com.scarlet.apijava.service.TopicoServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

	@Autowired
	private TopicoRepository topicoRepository;

	@Autowired
	private CursoRepository cursoRepository;

	@Autowired
	private TopicoServiceImpl topicoServicoImpl;

	// No curso o Professor disse que todos os metodos poderiam retornar um
	// ResponseEntity, ele só fez desse jeito para ir mostrando os diferentes
	// metodos de retorno
	@GetMapping
	public List<TopicoResponse> lista() {

		// Topico topico = new Topico("titulo topico", "mensagem do topico",new
		// Curso("Tads", "Programação"));
		// return TopicoDto.converterTopico(Arrays.asList(topico,topico,topico));

		List<Topico> topicos = topicoRepository.findAll();
		return TopicoResponse.converterTopico(topicos);

	}

	@GetMapping("/{id}")
	public TopicoResponse detalhar(@PathVariable Long id) {
		Topico topico = topicoRepository.getOne(id);

		return new TopicoResponse(topico);

	}

	// O transactional é para o JPA commitar a atualização, vc não precisa chamar
	// por exemplo, repository.update, ele faz isso sozinho
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<Object> atualizarTopico(@PathVariable Long id, @RequestBody TopicoRequest topicoRequest) {

		TopicoResponse topicoResponse = topicoServicoImpl.atualizarTopico(id, topicoRequest);

		return ResponseEntity.status(HttpStatus.CREATED).body(topicoResponse);
	}

	// vai no endpoint localhost:8080/topicos/retornarPorTitulo1?titulo=duvida
	@GetMapping("/retornarPorTitulo1")
	public List<TopicoResponse> listagemPorTitulo(@RequestParam("titulo") String titulo) {
		System.out.println(titulo);

		List<Topico> topicos = topicoRepository.findByTitulo(titulo);

		return TopicoResponse.converterTopico(topicos);

	}

	// localhost:8080/titulo/xx?titulo=Duvida
	@GetMapping("/xx")
	public List<TopicoResponse> listagemPorTitulo2(@RequestParam("titulo") String titulo) {
		System.out.println(titulo);

		List<Topico> topicos = topicoRepository.encontrarPorTitulo(titulo);

		return TopicoResponse.converterTopico(topicos);

	}

	// Para retornar alguma informação de que um novo recurso foi criado no servidor
	// (201), utilizamos o ResponseEntity,ou seja se quiser retornar algo do
	// POST/PUT/DELETE usa response entity
	// O ResponseEntity tem que ser retornado, ele tem algumas funções estaticas
	@PostMapping
	public ResponseEntity<Object> cadastrar(@RequestBody TopicoRequest topicoRequest) {

		ErrorApi errorApi = new ErrorApi("codigo parametro", "descircao Parametro");

		Topico topico = topicoServicoImpl.cadastrar(topicoRequest);

		// ErrorApi errorApi =
		// ErrorApi.builder().error(Error.builder().codigoErroTemp("404").descricaoErroTemp("Erro
		// no campo tal").detalheErroTemp("Detalhe do campo tal").build()).build();
		return ResponseEntity.status(HttpStatus.CREATED).body(new TopicoResponse(topico));
		// return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorApi);

	}

	// O Delete foi o ultimo metodo a ser feito, seguir ele como exemplo quando for
	// construir uma nova api, utilizando o findbyid, utilizando o response entity,
	// essas coisas
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deletar(@PathVariable Long id) {

		//Aqui ele ja verifica e retorna um Response Entity de acordo, se achou , se não achou, etc, acho que é melhor assim
		return topicoServicoImpl.deletar(id);

	}

}
