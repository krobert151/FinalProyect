package com.salesianostriana.dam.bichopedia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String nombre;
	private String descripcion;
	@Lob
	private String detalles;
	private String foto;
	
	@ManyToOne
	@JoinColumn(foreignKey= @ForeignKey(name="fk_especie_genero"))
	private  Genero genero;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@Builder.Default
	@OneToMany(
			mappedBy="especie",
			fetch = FetchType.EAGER,
			cascade = CascadeType.REMOVE,
			orphanRemoval = true)
	private List<Encuentro>encuentros = new ArrayList();
	

	
}
