package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.bichopedia.model.Reino;

public interface ReinoRepository extends JpaRepository<Reino, Long> {
	@Query("select distinct r from Reino r join fetch r.filos")
	List<Reino>findAll();
}
