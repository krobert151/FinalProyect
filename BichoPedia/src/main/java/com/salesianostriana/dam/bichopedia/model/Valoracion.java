package com.salesianostriana.dam.bichopedia.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
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
@Table(name="valoracion")
public class Valoracion {

	
	@EmbeddedId
	@Builder.Default
	private ValoracionPK valoracionPK = new ValoracionPK();
	
	@ManyToOne
	@MapsId("encuentro_id")
	@JoinColumn (foreignKey =@ForeignKey(name="fk_valoracion_encuentro"))
	private Encuentro encuentro;
	
	
	@ManyToOne
	@JoinColumn (foreignKey =@ForeignKey(name="fk_valoracion_usuario"))
	private Usuario usuario;
	
	private Long sexo;
	private Long especie;
	private Long foto;
	
	private Float puntuacionTotal;
	
	
	
	
}
