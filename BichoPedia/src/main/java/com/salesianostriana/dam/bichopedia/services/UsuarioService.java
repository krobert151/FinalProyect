package com.salesianostriana.dam.bichopedia.services;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Usuario;
import com.salesianostriana.dam.bichopedia.repo.UsuarioRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;

@Service
public class UsuarioService extends BaseService<Usuario,Long,UsuarioRepository>{

	public UsuarioService(UsuarioRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}





	
	
}
