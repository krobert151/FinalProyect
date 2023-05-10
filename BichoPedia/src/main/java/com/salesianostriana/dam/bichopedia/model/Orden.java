package com.salesianostriana.dam.bichopedia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Orden")
public class Orden {
	@Id
	@GeneratedValue
	private Long id;
	private String nombre, descripcion;
	
	@ManyToOne
	private Clase clase;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@Builder.Default
	@OneToMany(
			mappedBy="orden",
			fetch=FetchType.EAGER,
			cascade=CascadeType.REMOVE,
			orphanRemoval=true)
	private List<Familia> familias = new ArrayList<>();
	
	public void addFamilia(Familia f) {
		f.setOrden(this);
		this.familias.add(f);	
		
	}
	public void removeFamilia(Familia f) {
		this.familias.remove(f);
		f.setOrden(null);
		
	}
	
	
	
	
}
