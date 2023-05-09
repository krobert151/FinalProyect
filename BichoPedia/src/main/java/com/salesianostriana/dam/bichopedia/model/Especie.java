package com.salesianostriana.dam.bichopedia.model;
import java.util.ArrayList;
import java.util.List;

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
@Table(name="Especie")
public class Especie {
	@Id
	@GeneratedValue
	private Long id;

	private String nombre;
	private String descripcion;
	private String detalles;
	private String foto;
	
	@ManyToOne
	private  Genero genero;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@Builder.Default
	@OneToMany(
			mappedBy="especie",
			fetch = FetchType.EAGER)
	private List<Encuentro>encuentros = new ArrayList();
	

	
}
