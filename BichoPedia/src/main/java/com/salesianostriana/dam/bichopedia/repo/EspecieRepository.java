package com.salesianostriana.dam.bichopedia.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.bichopedia.model.Especie;

public interface EspecieRepository extends JpaRepository<Especie, Long>{

	@Override
	List<Especie> findAll();
	
	List<Especie> findByOrderByNombreAsc();
	
	List<Especie> findByOrderByDescripcionAsc();
	
	List<Especie> findByOrderByGeneroNombreAsc();

	@Query("select e from Especie e where e.genero.id = ?1")
	public List<Especie> findByGeneroId(Long generoId);
	
}
