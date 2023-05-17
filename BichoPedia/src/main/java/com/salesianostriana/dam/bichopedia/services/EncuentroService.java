package com.salesianostriana.dam.bichopedia.services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Encuentro;
import com.salesianostriana.dam.bichopedia.model.Valoracion;
import com.salesianostriana.dam.bichopedia.repo.EncuentroRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;

@Service
public class EncuentroService extends BaseService <Encuentro,Long,EncuentroRepository>{

	public EncuentroService(EncuentroRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}

	public List<Encuentro>findAllBySorted(Direction direction,String orderBy) {
        Sort sort = Sort.by(direction, orderBy);
        return this.repositorio.findAll(sort);
		
	}
	
	public List<Encuentro> ordenarEncuentrosPorValoracionMedia(List<Encuentro> encuentros) {
	    return encuentros.stream()
	            .sorted(Comparator.comparingDouble(this::calcularValoracionMedia))
	            .collect(Collectors.toList());
	}

	private double calcularValoracionMedia(Encuentro encuentro) {
	    List<Valoracion> valoraciones = encuentro.getValoraciones();
	    double sumaValoraciones = valoraciones.stream()
	            .mapToDouble(x->x.getPuntuacionTotal())
	            .sum();
	    return sumaValoraciones / valoraciones.size();
	}


	@Override
	public List<Encuentro> findAll() {
		// TODO Auto-generated method stub
		return this.repositorio.findAll();
	}
	
	public List<Encuentro>findByNombre(String nombre){
		
		return this.repositorio.findByEspecieDescripcion(nombre);
				
	}
	
	public List<Encuentro> findAllByUser(Long userId){
		
		return this.repositorio.findByUsuarioId(userId);
		
	}

}
