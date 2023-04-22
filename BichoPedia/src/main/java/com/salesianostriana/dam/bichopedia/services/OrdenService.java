package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import com.salesianostriana.dam.bichopedia.model.Orden;
import com.salesianostriana.dam.bichopedia.repo.OrdenRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;

public class OrdenService extends BaseService<Orden,Long,OrdenRepository>{

	public OrdenService(OrdenRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Orden> findAll() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}
	
	
	

}