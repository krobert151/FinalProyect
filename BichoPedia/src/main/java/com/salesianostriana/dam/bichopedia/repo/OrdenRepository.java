package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.bichopedia.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden,Long>{

	@Query("select distinct o from Orden o join fetch o.familias")
	List<Orden> findAllJoin();
	
}
