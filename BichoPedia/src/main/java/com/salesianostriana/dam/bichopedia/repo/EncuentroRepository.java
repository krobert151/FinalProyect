package com.salesianostriana.dam.bichopedia.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.salesianostriana.dam.bichopedia.model.Encuentro;
@Repository
public interface EncuentroRepository extends JpaRepository<Encuentro, Long> {

	
	List<Encuentro> findAll();

	@Query("select e from Encuentro e where e.usuario.id = ?1")
	List<Encuentro> findByUsuarioId(Long usuarioId);
	
	@Query("SELECT e FROM Encuentro e WHERE UPPER(e.especie.descripcion) LIKE UPPER(CONCAT('%', ?1, '%'))")
	List<Encuentro> findByEspecieDescripcion(String nombre);



	
}
