package com.salesianostriana.dam.bichopedia.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salesianostriana.dam.bichopedia.model.Producto;
@Service
public class ProductoService {

	public List<Producto> getLista(){
		
		return Arrays.asList(
				new Producto(1,"Botas de Montañismo",50.50,"Botas ideales para hacer montañismo",4.3,"Ropa"),
				new Producto(2,"2M de cuerda",3.4,"Dos metros de cuerda",3.3,"Materiales"),
				new Producto(3,"Camara 1500MP",503.50,"Camara potente",5,"Materiales")
				);
		
		
	} 
	
}
