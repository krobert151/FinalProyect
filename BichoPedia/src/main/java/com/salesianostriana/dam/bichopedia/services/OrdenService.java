package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Orden;
import com.salesianostriana.dam.bichopedia.repo.OrdenRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;
@Service
public class OrdenService extends BaseService<Orden,Long,OrdenRepository>{

	public OrdenService(OrdenRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Orden> findAll() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}
	
	public List<Orden>sortedName(){
		return this.repositorio.findByOrderByNombreAsc();
	}
	public List<Orden>sortedCla(){
		return this.repositorio.findByOrderByClaseNombreAsc();
	}
	public List<Orden>sortedComunN(){
		return this.repositorio.findByOrderByDescripcionAsc();
		
	}
	public List<Orden> findAllByClaseId(Long claseId){
		
		return this.repositorio.findByClaseId(claseId);
		
	}
	
	

}
