package com.salesianostriana.dam.bichopedia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genero {
	@Id
	@GeneratedValue
	private Long idGenero;
	
	private String nombre;
	private String descripcion;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@OneToMany(mappedBy="genero", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Especie> especies = new ArrayList<>();
	
	public Genero(String nombre, String descripcion) {
		
		this.nombre=nombre;
		this.descripcion=descripcion;
		
	}
	
	public void addEspecie(Especie e) {
		e.setGenero(this);
		this.especies.add(e);
		
	}
	public void removeEspecie(Especie e) {
		this.especies.remove(e);
		e.setGenero(null);
	}
	
}
