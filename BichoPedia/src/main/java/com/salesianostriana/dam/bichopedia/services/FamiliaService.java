package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Familia;
import com.salesianostriana.dam.bichopedia.repo.FamiliaRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;

@Service
public class FamiliaService extends BaseService<Familia,Long,FamiliaRepository>{

	public FamiliaService(FamiliaRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Familia> findAll() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}
	
	public List<Familia> sortedName(){
		return this.repositorio.findByOrderByNombreAsc();
	}
	
	public List<Familia>sortedComunN(){
		return this.repositorio.findByOrderByDescripcionAsc();
	} 
	
	public List<Familia>sortedOrd(){
		
		return this.repositorio.findByOrderByOrdenNombreAsc();
		
	}
	

}
