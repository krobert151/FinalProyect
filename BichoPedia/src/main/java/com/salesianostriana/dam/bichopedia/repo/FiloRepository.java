package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.bichopedia.model.Filo;

public interface FiloRepository extends JpaRepository<Filo, Long> {

	@Query("select distinct f from Filo f join fetch f.clases")
	List<Filo>findAll();
	
}
