package com.salesianostriana.dam.bichopedia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="producto")
public class Producto {
	@Id
	@GeneratedValue
	private int idProducto;
	private String nombre;
	private double precioU;
	private String descripcion;
	private double valoracion;
	private String categoria;
	
}
