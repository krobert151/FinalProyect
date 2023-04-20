package com.salesianostriana.dam.bichopedia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Especie {
	@Id
	@GeneratedValue
	private Long idEspecie;

	private String nombre;
	private String descripcion;
	private String fotoUrl;
	
	@ManyToOne
	private  Genero genero;
	
	
}
