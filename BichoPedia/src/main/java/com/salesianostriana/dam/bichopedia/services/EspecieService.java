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
		return super.findAll()
					.stream()
					.sorted((x,y)-> x.getNombre()
							.compareToIgnoreCase(y.getNombre()))
					.toList();
		
	}
	public List<Especie> sortedGen(){
		return super.findAll()
					.stream()
					.sorted((x,y)-> x.getGenero().getNombre()
							.compareToIgnoreCase(y.getGenero().getNombre()))
					.toList();
		
	}
	public List<Especie> sortedComunN(){
		return super.findAll()
					.stream()
					.sorted((x,y)->x.getDescripcion()
							.compareToIgnoreCase(y.getDescripcion()))
					.toList();
	}
	
	
}
