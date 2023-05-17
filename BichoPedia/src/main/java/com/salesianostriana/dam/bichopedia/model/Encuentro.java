package com.salesianostriana.dam.bichopedia.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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
@Table(name="encuentro")
public class Encuentro {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@JoinColumn(foreignKey= @ForeignKey(name="fk_encuentro_usuario"))
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(foreignKey= @ForeignKey(name="fk_encuentro_especie"))
	private Especie especie;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate fecha;

	@Lob
	private String descripcion;
	private String foto;
	private String zona;
	private double tamanio;
	private double peso;
	private char sexo;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@Builder.Default
	@OneToMany(
			mappedBy="encuentro",
			fetch = FetchType.EAGER,
			cascade = CascadeType.REMOVE,
			orphanRemoval = true)
	private List<Valoracion>valoraciones = new ArrayList();
	
	public Encuentro getEncuentro() {
		
		return this;
	}
	
	
}
