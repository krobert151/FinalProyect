package com.salesianostriana.dam.bichopedia.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.dam.bichopedia.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

	Optional<Usuario> findFirstByUsername(String username);

	
	
}
