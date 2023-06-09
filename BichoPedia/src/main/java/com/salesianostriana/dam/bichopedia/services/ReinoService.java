package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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

	public List<Reino>findByName(String nombre){
		
		return this.repositorio.findByNombreContainingIgnoreCase(nombre);
		
	}
	
	
	public List<Reino>findAllSortedBy(Direction direction,String orderBy) {
        Sort sort = Sort.by(direction, orderBy);
        return this.repositorio.findAll(sort);
		
	}
	
	public List<Reino> sortedName(){
		return this.repositorio.findByOrderByNombreAsc();
	}
	
	

}
