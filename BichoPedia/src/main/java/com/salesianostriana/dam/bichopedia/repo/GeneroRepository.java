package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.salesianostriana.dam.bichopedia.model.Genero;

public interface GeneroRepository extends JpaRepository<Genero,Long>{
	
	List<Genero>findAll();
	
	List<Genero> findByOrderByNombreAsc();
	
	List<Genero> findByOrderByDescripcionAsc();
	
	List<Genero>findByOrderByFamiliaNombreAsc();
	
	@Query("select g from Genero g where g.familia.id = ?1")
	public List<Genero> findByFamiliaId(Long familiaId);
	
}
