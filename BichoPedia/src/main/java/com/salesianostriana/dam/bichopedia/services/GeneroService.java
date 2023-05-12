package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

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
	
	
	public List<Genero> sortedName(){
		
		return this.repositorio.findByOrderByNombreAsc();
		
	}
	
	public List<Genero> sortedComunN(){
		
		return this.repositorio.findByOrderByFamiliaNombreAsc();
		
	}
	
	public List<Genero> sortedFam(){
		
		return this.repositorio.findByOrderByNombreAsc();
		
	}
	
	public List<Genero> findAllByFamilia(Long familiaId){
		
		return this.repositorio.findByFamiliaId(familiaId);
		
	}
	
	
	
}
