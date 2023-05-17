package com.salesianostriana.dam.bichopedia.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

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
	
	private Long valoracion_id;
	
}
