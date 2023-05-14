package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Encuentro;
import com.salesianostriana.dam.bichopedia.repo.EncuentroRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;

@Service
public class EncuentroService extends BaseService <Encuentro,Long,EncuentroRepository>{

	public EncuentroService(EncuentroRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	public List<Encuentro>findAllBySorted(String orderBy){
		
		Sort sort = Sort.by(orderBy);
		return this.repositorio.findAll(sort);
		
	}
	
	
	@Override
	public List<Encuentro> findAll() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}

}
