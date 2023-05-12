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

	public List<Especie> sortedName(){
		return this.repositorio.findByOrderByNombreAsc();
		
	}
	public List<Especie> sortedGen(){
		return this.repositorio.findByOrderByGeneroNombreAsc();
		
	}
	public List<Especie> sortedComunN(){
		return this.repositorio.findByOrderByDescripcionAsc();
	}
	
	public List<Especie> findAllByGenero(Long generoId){
		
		return this.repositorio.findByGeneroId(generoId);
		
	}
	
}
