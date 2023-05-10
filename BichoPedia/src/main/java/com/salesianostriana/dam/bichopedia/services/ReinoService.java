package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

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

	@Override
	public List<Reino> findAll() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}

	public List<Reino> sortedName(){
		return this.repositorio.findAll()
				.stream()
				.sorted((x,y)-> x.getNombre()
						.compareToIgnoreCase(y.getNombre()))
				.toList();
	}
	public List<Reino> sortedComunN(){
		return this.repositorio.findAll()
				.stream()
				.sorted((x,y)->x.getDescripcion()
						.compareToIgnoreCase(y.getDescripcion()))
				.toList();
	}
	

}
