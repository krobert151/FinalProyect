package com.salesianostriana.dam.bichopedia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="reino")
public class Reino {

	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre,descripcion,foto;
	
	@OneToMany(
			mappedBy="reino",
			fetch=FetchType.EAGER,
			cascade=CascadeType.REMOVE,
			orphanRemoval=true)
	private List<Filo>filos = new ArrayList<>();
	
	public void addFilo(Filo f) {
		f.setReino(this);
		this.filos.add(f);		
		
	}
	public void removeFilo(Filo f) {
		this.filos.remove(f);
		f.setReino(null);
		
	}
	
}
