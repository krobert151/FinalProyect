package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.bichopedia.model.Encuentro;

public interface EncuentroRepository extends JpaRepository<Encuentro, Long> {

	
	List<Encuentro> findAll();

	@Query("select e from Encuentro e where e.usuario.id = ?1")
	List<Encuentro> findByUsuarioId(Long encuentroId);
	
}
