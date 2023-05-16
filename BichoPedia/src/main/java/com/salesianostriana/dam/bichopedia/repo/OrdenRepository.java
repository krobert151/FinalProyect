package com.salesianostriana.dam.bichopedia.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.bichopedia.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden,Long>{

	List<Orden> findAll();
	
	List<Orden> findByNombreContainingIgnoreCase(String nombre);
	
	@Query("select o from Orden o where o.clase.id = ?1")
	public List<Orden> findByClaseId(Long claseId);

	
}
