package br.com.scarlet.apijava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.scarlet.apijava.modelos.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);
	
	

}
