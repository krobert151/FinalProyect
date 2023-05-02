package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Especie;
import com.salesianostriana.dam.bichopedia.repo.EspecieRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;
@Service
public class EspecieService extends BaseService<Especie,Long,EspecieRepository>{

	public EspecieService(EspecieRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Especie> findAll() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}

	
	
}
