package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import com.salesianostriana.dam.bichopedia.model.Clase;
import com.salesianostriana.dam.bichopedia.repo.ClaseRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;

public class ClaseService extends BaseService <Clase,Long,ClaseRepository>{

	public ClaseService(ClaseRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Clase> findAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}
	
	

}
