package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.bichopedia.model.Filo;

public interface FiloRepository extends JpaRepository<Filo, Long> {

	List<Filo> findAll();
	
	List<Filo> findByOrderByNombreAsc();
	
	List<Filo> findByOrderByDescripcionAsc();
	
	List<Filo> findByOrderByReinoNombreAsc();
	
}
