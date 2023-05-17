package com.salesianostriana.dam.bichopedia.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Encuentro;
import com.salesianostriana.dam.bichopedia.model.Valoracion;
import com.salesianostriana.dam.bichopedia.model.ValoracionPK;
import com.salesianostriana.dam.bichopedia.repo.ValoracionRepository;
import com.salesianostriana.dam.bichopedia.services.base.BaseService;
@Service
public class ValoracionService extends BaseService<Valoracion, ValoracionPK, ValoracionRepository> {

	
	public ValoracionService(ValoracionRepository repo) {
		super(repo);
		// TODO Auto-generated constructor stub
	}
	
	
	public Float mediaValoracionPorEncuentro(Long encuentroId) {
		
		List<Valoracion> valoraciones =this.repositorio.findByEncuentroId(encuentroId);
		
		return Math.round(valoraciones.stream().map(Valoracion::getPuntuacionTotal)
					.reduce((float) 0, (a,b)-> a + b)/valoraciones.size()*10.0)/10.f;
							
		
	}
	public List<Float> mediasPorEncuentros (List<Encuentro> encuentros){
		
		return encuentros.stream().map(x-> mediaValoracionPorEncuentro(x.getId())).toList();
		
	}
	
	

}
