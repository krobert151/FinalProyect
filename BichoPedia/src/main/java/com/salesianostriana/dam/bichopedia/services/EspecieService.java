package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Especie;
import com.salesianostriana.dam.bichopedia.repo.EspecieRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;
@Service
public class EspecieService extends BaseService<Especie,Long,EspecieRepository>{

	public EspecieService(EspecieRepository repo) {
        super(repo);
    }

    public List<Especie> findAllSorted(Direction direction,String orderBy) {
        Sort sort = Sort.by(direction, orderBy);
        return this.repositorio.findAll(sort);
    }
    

    public List<Especie> findAllByGenero(Long generoId){
        return this.repositorio.findByGeneroId(generoId);
    }
	
}
