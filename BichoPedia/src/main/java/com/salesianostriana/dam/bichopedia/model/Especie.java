package com.salesianostriana.dam.bichopedia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Especie {
	@Id
	@GeneratedValue
	private Long idEspecie;

	private String nombre;
	private String descripcion;
	
	@ManyToOne
	private  Genero genero;
	
	public Especie(String nombre, String descripcion) {
		
		this.nombre=nombre;
		this.descripcion=descripcion;
		
	}
	
}
