package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.data.domain.Sort;
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
	
	public List<Clase>findAllBySorted(String orderBy){
		
		Sort sort= Sort.by(orderBy);
		return this.repositorio.findAll(sort);
		
	}
	
	
	public List<Clase>findAllByFiloId(Long filoId){
		
		return this.repositorio.findByFiloId(filoId);
	}

}
