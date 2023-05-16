package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	
	public List<Orden>findAllBySorted(Direction direction,String orderBy) {
        Sort sort = Sort.by(direction, orderBy);
        return this.repositorio.findAll(sort);
		
		
	}
	
	public List<Orden> findAllByClaseId(Long claseId){
		
		return this.repositorio.findByClaseId(claseId);
		
	}
	
	

}
