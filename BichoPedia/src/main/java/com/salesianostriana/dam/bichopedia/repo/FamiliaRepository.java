package com.salesianostriana.dam.bichopedia.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.bichopedia.model.Familia;

public interface FamiliaRepository extends JpaRepository<Familia,Long>{

	List<Familia>findAll();
	
	
	
	
	@Query("select f from Familia f where f.orden.id = ?1")
	public List<Familia> findByOrdenId(Long ordenId);
	
}
