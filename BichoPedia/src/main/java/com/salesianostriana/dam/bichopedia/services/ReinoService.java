package com.salesianostriana.dam.bichopedia.services;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Reino;
import com.salesianostriana.dam.bichopedia.repo.ReinoRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;

@Service
public class ReinoService extends BaseService<Reino, Long, ReinoRepository> {

	public ReinoService(ReinoRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}


	

}
