package com.salesianostriana.dam.bichopedia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name="Genero")
public class Genero {
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre, descripcion;
	
	@ManyToOne
	@JoinColumn(foreignKey= @ForeignKey(name="fk_familia_genero"))
	private Familia familia;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@Builder.Default
	@OneToMany(
			mappedBy="genero",
			fetch = FetchType.EAGER,
			cascade = CascadeType.REMOVE, 
			orphanRemoval = true)
	private List<Especie> especies = new ArrayList<>();
	
	
	public void addEspecie(Especie e) {
		e.setGenero(this);
		this.especies.add(e);
		
	}
	public void removeEspecie(Especie e) {
		this.especies.remove(e);
		e.setGenero(null);
	}
	
}
