package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.bichopedia.model.Genero;

public interface GeneroRepository extends JpaRepository<Genero,Long>{
	
	@Query("select distinct g from Genero g join fetch g.especies")
	List<Genero> findAllJoin();
	}