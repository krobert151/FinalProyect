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
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="clase")
public class Clase {
	@Id
	@GeneratedValue
	private Long id;
	 
	private String nombre, descripcion;
	
	@ManyToOne
	private Filo filo;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@Builder.Default
	@OneToMany(
			mappedBy="clase",
			fetch=FetchType.EAGER,
			cascade=CascadeType.REMOVE,
			orphanRemoval=true)
	private List<Orden>ordenes = new ArrayList<>();
	
	public void addOrden(Orden o) {
		o.setClase(this);
		this.ordenes.add(o);	
		
	}
	public void removeOrden(Orden o) {
		this.ordenes.remove(o);
		o.setClase(null);
		
	}
	
	
	
}
