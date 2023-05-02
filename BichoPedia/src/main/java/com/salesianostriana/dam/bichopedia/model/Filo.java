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
@Table(name="filo")
public class Filo {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	private Reino reino;
	
	private String nombre,descripcion,foto;
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@Builder.Default
	@OneToMany(
			mappedBy="filo",
			fetch=FetchType.EAGER,
			cascade = CascadeType.REMOVE,
			orphanRemoval=true			
			)
	private List<Clase>clases= new ArrayList<>();
	
	public void addClase(Clase c) {
		c.setFilo(this);
		this.clases.add(c);
		
	}
	public void removeClase(Clase c) {
		this.clases.remove(c);
		c.setFilo(null);
		
	}
	
}
