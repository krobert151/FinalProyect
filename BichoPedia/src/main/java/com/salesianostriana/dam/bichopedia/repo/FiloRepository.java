package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.salesianostriana.dam.bichopedia.model.Filo;

public interface FiloRepository extends JpaRepository<Filo, Long> {

	List<Filo> findAll();
	
	List<Filo>findByNombreContainingIgnoreCase(String nombre);
	
	@Query("select f from Filo f where f.reino.id = ?1")
	public List<Filo> findByReinoId(Long reinoId);
	
}
