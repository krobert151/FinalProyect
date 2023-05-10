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
		
		return this.repositorio.findAll()
					.stream()
					.sorted((x,y)->x.getNombre()
							.compareToIgnoreCase(y.getNombre()))
					.toList();
		
	}
	
	public List<Genero> sortedComunN(){
		
		return this.repositorio.findAll()
					.stream()
					.sorted((x,y)->x.getDescripcion()
							.compareToIgnoreCase(y.getDescripcion()))
					.toList();
		
	}
	
	public List<Genero> sortedFam(){
		
		return this.repositorio.findAll()
				.stream()
				.sorted((x,y)->x.getFamilia().getNombre()
						.compareToIgnoreCase(y.getFamilia().getNombre()))
				.toList();
		
	}
	
	
	
	
}
