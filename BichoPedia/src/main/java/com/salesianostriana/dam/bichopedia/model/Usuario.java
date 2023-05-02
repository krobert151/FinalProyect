package com.salesianostriana.dam.bichopedia.model;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue
	private Long id_usuario;
	
	private String nombre;
	private String apellidos;
	private String correo;
	private String username;
	private String passwd;
	@Column(name="fechanac")
	private LocalDate fechaNac;
	private boolean administrator;
	
	@EqualsAndHashCode.Exclude
	@ToString.Exclude
	@Builder.Default
	@OneToMany(
			mappedBy="usuario",
			fetch = FetchType.EAGER)
	private List<Encuentro>encuentros = new ArrayList();
	

	
}



