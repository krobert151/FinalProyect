package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.bichopedia.model.Genero;

public interface GeneroRepository extends JpaRepository<Genero,Long>{
	
	List<Genero>findAll();
	
	List<Genero> findByOrderByNombreAsc();
	
	List<Genero> findByOrderByDescripcionAsc();
	
	List<Genero>findByOrderByFamiliaNombreAsc();
	
	
	
}
