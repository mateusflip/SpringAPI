package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

//JpaRepository é uma classe do spring que recebe genericamente uma classe e o tipo do id da classe
public interface TopicoRepository extends JpaRepository<Topico, Long>{

	//Aqui estamos concatenando a Entidade e depois o atributo que queremos pegar, este caso é somente para relacionamentos
	List<Topico> findByCurso_Nome(String nomeCurso);


}
