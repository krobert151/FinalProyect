package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	public List<Familia> findAllSorted(Direction direction,String orderBy) {
        Sort sort = Sort.by(direction, orderBy);
        return this.repositorio.findAll(sort);
	}	
	
	public List<Familia>findByName(String nombre){
		
		return this.repositorio.findByNombreContainingIgnoreCase(nombre);
		
	}
	

	
	
	public List<Familia> findAllByOrdenId(Long ordenId){
		
		return this.repositorio.findByOrdenId(ordenId);
		
	}
	

}
