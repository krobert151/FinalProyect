package com.salesianostriana.dam.bichopedia.repo;


import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.bichopedia.model.Especie;

public interface EspecieRepository extends JpaRepository<Especie, Long>{

	@Override
	List<Especie> findAll();
	
	List<Especie> findByOrderByNombreAsc();
	
	List<Especie> findByOrderByDescripcionAsc();
	
	List<Especie> findByOrderByGeneroNombreAsc();

	
	
}
