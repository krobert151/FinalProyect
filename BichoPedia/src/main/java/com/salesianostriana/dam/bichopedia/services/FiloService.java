package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import com.salesianostriana.dam.bichopedia.model.Filo;
import com.salesianostriana.dam.bichopedia.repo.FiloRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;

public class FiloService extends BaseService<Filo,Long,FiloRepository>{

	public FiloService(FiloRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Filo> findAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	
	
}
