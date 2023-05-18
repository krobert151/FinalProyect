package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.bichopedia.model.Valoracion;
import com.salesianostriana.dam.bichopedia.model.ValoracionPK;
@Repository
public interface ValoracionRepository extends JpaRepository<Valoracion, ValoracionPK> {

	
	 @Query("select v from Valoracion v where v.encuentro.id = ?1")
	 List<Valoracion> findByEncuentroId(Long id);

	
}
