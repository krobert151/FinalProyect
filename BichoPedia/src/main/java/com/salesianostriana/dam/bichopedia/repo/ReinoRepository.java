package com.salesianostriana.dam.bichopedia.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.bichopedia.model.Reino;

public interface ReinoRepository extends JpaRepository<Reino, Long> {

	List<Reino> findAll();
	
	List<Reino> findByOrderByNombreAsc();
	
	List<Reino> findByNombreContainingIgnoreCase(String nombre);
}
