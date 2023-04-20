package com.salesianostriana.dam.bichopedia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Familia {
	@Id
	@GeneratedValue
	private Long idFamilia;
	
	private String nombre,descripcion;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@Builder.Default
	@OneToMany(
			mappedBy="familia",
			fetch = FetchType.EAGER,
			cascade = CascadeType.REMOVE, 
			orphanRemoval = true)
	private List<Genero> generos = new ArrayList<>();
	
	public void addGenero(Genero g) {
		g.setFamilia(this);
		this.generos.add(g);
	}
	public void removeGenero(Genero g) {
		this.generos.remove(g);
		g.setFamilia(null);
	}
	
}
