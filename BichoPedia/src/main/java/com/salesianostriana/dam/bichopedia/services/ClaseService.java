package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Clase;
import com.salesianostriana.dam.bichopedia.repo.ClaseRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;
@Service
public class ClaseService extends BaseService <Clase,Long,ClaseRepository>{

	public ClaseService(ClaseRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Clase> findAll() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}
	
	public List<Clase>sortedName(){
		return this.repositorio.findByOrderByNombreAsc();
	}
	public List<Clase>sortedComun(){
		return this.repositorio.findByOrderByDescripcionAsc();
	}
	public List<Clase>sortedFil(){
		return this.repositorio.findByOrderByFiloNombreAsc();
	}

}
