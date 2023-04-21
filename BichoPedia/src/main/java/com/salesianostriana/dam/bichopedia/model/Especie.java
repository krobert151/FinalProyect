package com.salesianostriana.dam.bichopedia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Especie")
public class Especie {
	@Id
	@GeneratedValue
	private Long id;

	private String nombre;
	private String descripcion;
	private String foto;
	
	@ManyToOne
	private  Genero genero;
	
	
}
