package com.salesianostriana.dam.bichopedia.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.bichopedia.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden,Long>{

	List<Orden> findAll();
	
	List<Orden> findByOrderByNombreAsc();
	
	List<Orden> findByOrderByDescripcionAsc();
	
	List<Orden> findByOrderByClaseNombreAsc();
	
}
