package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Usuario;
import com.salesianostriana.dam.bichopedia.repo.UsuarioRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;

@Service
public class UsuarioService extends BaseService<Usuario,Long,UsuarioRepository>{
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	
	public UsuarioService(UsuarioRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Usuario save(Usuario t) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(t);
	}

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario edit(Usuario t) {

		return usuarioRepository.save(t);
	}

	@Override
	public void delete(Usuario t) {
		// TODO Auto-generated method stub
		usuarioRepository.delete(t);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(id);
	}

	
	
	




	
	
}
