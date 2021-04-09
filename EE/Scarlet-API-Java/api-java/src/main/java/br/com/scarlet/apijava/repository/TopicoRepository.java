package br.com.scarlet.apijava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.scarlet.apijava.modelos.Topico;

//Para começar a trabalhar com o spring data, herdamos da interface jpaRepository
//E essa interface herdada tem um generics (??) e tem tem que passar 2 tipos
//O primeiro é o nome da entidade que vc vai trabalhar aqui.
//O segundo é qual é o tipo do da chave primaria que sera trabalhado nessa interface
public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByTitulo(String titulo);

	@Query("from Topico where titulo= ?1")
	List<Topico> encontrarPorTitulo(String titulo);

}
