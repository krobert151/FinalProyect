package com.salesianostriana.dam.bichopedia;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.bichopedia.model.Especie;
import com.salesianostriana.dam.bichopedia.model.Genero;
import com.salesianostriana.dam.bichopedia.repo.GeneroRepository;

@Component
public class Input {

	@Autowired
	private GeneroRepository generoRepo;
	//private FamiliaRepository familiaRepo;
	
	@PostConstruct
	public void ejecutar() {
		
		/*Familia lycosiade = Familia.builder()
				.nombre("Lycosidae")
				.descripcion("Familia de Arañas cazadoras")
				.build();
		
		Familia salamandridae = Familia.builder()
				.nombre("salamandridae")
				.descripcion("Familia de las salamandras mas comunes")
				.build();
		*/
		
		
		Genero lycosa = Genero.builder()
				.nombre("Lycosas")
				.descripcion("Genero de arañas grandes")
				.build();
		
		Genero triturus = Genero.builder()
				.nombre("triturus")
				.descripcion("Genero de tritones")
				.build();
		
		//lycosiade.addGenero(lycosa);
		//salamandridae.addGenero(triturus);
		
		lycosa.addEspecie(Especie.builder()
				.nombre("Lycosa Hispanicus")
				.descripcion("Tarantula de España")
				.fotoUrl("Url")
				.build());
		lycosa.addEspecie(
				Especie.builder()
				.nombre("Lycosa Lycosa")
				.descripcion("Lycosa común")
				.fotoUrl("Url")
				.build());
		
		triturus.addEspecie(
				Especie.builder()
				.nombre("Tritorus marmoratus")
				.descripcion("Tritón Jaspeado (mola)")
				.fotoUrl("Url")
				.build());
		
		triturus.addEspecie(
				Especie.builder()
				.nombre("Lissotron ibericus")
				.descripcion("Tritón iberico (mola con webos)")
				.fotoUrl("Url")
				.build());
		
		generoRepo.save(lycosa);
		generoRepo.save(triturus);
		
		//familiaRepo.save(lycosiade);
		//familiaRepo.save(salamandridae);
		
	}
	
}
