package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Genero;
import com.salesianostriana.dam.bichopedia.repo.GeneroRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;

@Service
public class GeneroService extends BaseService<Genero,Long,GeneroRepository>{
	
	public GeneroService (GeneroRepository repo) {
		super(repo);
		
	}

	@Override
	public List<Genero> findAll() {
		return this.repositorio.findAll();
	}
	
	public List<Genero> findAllSorted(String orderBy){
		
		Sort sort = Sort.by(orderBy);
		return this.repositorio.findAll(sort);
	}
	
	
	
	public List<Genero> findAllByFamilia(Long familiaId){
		
		return this.repositorio.findByFamiliaId(familiaId);
		
	}
	
	
	
}
