package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.bichopedia.model.Encuentro;

public interface EncuentroRepository extends JpaRepository<Encuentro, Long> {

	
	List<Encuentro> findAll();

	
	
}
