package com.salesianostriana.dam.bichopedia.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	private LocalDateTime fecha;
	private String descripcion;
	private String foto;
	private String zona;
	private double tamanio;
	private double peso;
	private char sexo;
	
	public Encuentro getEncuentro() {
		
		return this;
	}
	
	
}
