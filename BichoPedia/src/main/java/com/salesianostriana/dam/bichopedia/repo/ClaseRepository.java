package com.salesianostriana.dam.bichopedia.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.bichopedia.model.Clase;

public interface ClaseRepository extends JpaRepository<Clase,Long>{

	List<Clase>findAll();
	
	
	
	@Query("select c from Clase c where c.filo.id = ?1")
	public List<Clase> findByFiloId(Long filoId);
}
