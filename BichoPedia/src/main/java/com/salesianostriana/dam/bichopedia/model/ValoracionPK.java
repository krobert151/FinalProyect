package com.salesianostriana.dam.bichopedia.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Embeddable
public class ValoracionPK implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long encuentro_id;
	
	@Column(columnDefinition = "bigint GENERATED BY DEFAULT AS IDENTITY")
	private Long valoracion_id;
	
	public ValoracionPK getValoracionPK() {
		
		return this;
		
	}
	
}
