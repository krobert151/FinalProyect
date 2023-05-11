package com.salesianostriana.dam.bichopedia.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.bichopedia.model.Clase;

public interface ClaseRepository extends JpaRepository<Clase,Long>{

	List<Clase>findAll();
	
	List<Clase>findByOrderByNombreAsc();
	
	List<Clase>findByOrderByDescripcionAsc();
	
	List<Clase>findByOrderByFiloNombreAsc();
	
	
}
