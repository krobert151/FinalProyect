package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import com.salesianostriana.dam.bichopedia.model.Reino;
import com.salesianostriana.dam.bichopedia.repo.ReinoRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;

public class ReinoService extends BaseService<Reino, Long, ReinoRepository> {

	public ReinoService(ReinoRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Reino> findAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}
	

}
