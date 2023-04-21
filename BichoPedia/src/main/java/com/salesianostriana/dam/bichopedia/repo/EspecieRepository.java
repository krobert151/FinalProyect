package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.bichopedia.model.Especie;
import com.salesianostriana.dam.bichopedia.model.Familia;

public interface EspecieRepository extends JpaRepository<Especie, Long>{

	@Query("select distinct f from Familia f join fetch f.generos")
	List<Familia> findAllJoin();
}
