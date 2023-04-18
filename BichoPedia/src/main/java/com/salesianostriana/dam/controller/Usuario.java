package com.salesianostriana.dam.controller;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue
	private int id_usuario;
	
	private String nombre;
	private String apellidos;
	private String correo;
	private String username;
	private String password;
	private LocalDate fechaNac;
	
	
}
