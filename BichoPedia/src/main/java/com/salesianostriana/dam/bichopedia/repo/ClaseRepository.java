package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.bichopedia.model.Clase;

public interface ClaseRepository extends JpaRepository<Clase,Long>{

	@Query("select distinct c from Clase c join fetch c.ordenes")
	List<Clase> findAllJoin();
}
