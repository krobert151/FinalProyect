package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Encuentro;
import com.salesianostriana.dam.bichopedia.repo.EncuentroRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;

@Service
public class EncuentroServices extends BaseService <Encuentro,Long,EncuentroRepository>{

	public EncuentroServices(EncuentroRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Encuentro> findAll() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}

}
