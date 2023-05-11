package com.salesianostriana.dam.bichopedia.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.bichopedia.model.Familia;

public interface FamiliaRepository extends JpaRepository<Familia,Long>{

	List<Familia>findAll();
	
	List<Familia>findByOrderByNombreAsc();
	
	List<Familia>findByOrderByDescripcionAsc();
	
	List<Familia>findByOrderByOrdenNombreAsc();
	
}
