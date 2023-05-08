package com.salesianostriana.dam.bichopedia;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.salesianostriana.dam.bichopedia.model.Usuario;
import com.salesianostriana.dam.bichopedia.repo.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitData {

	private final UsuarioRepository repo;
	private final PasswordEncoder passwordEncoder;
	
	@PostConstruct
	public void init() {
		
		Usuario usuario = Usuario.builder()
				.nombre("Usuario")
				.apellidos("Usuario")
				.correo("usuario@gmail.com")
				.fechaNac(LocalDate.of(2000, 01, 01))
				.administrator(false)
				.username("user")
				.passwd(passwordEncoder.encode("1234"))
				.build();
		
		Usuario krobert = Usuario.builder()
				.nombre("Roberto")
				.apellidos("Rebolledo Naharro")
				.correo("robertorebolledo151@gmail.com")
				.fechaNac(LocalDate.of(2004, 10, 12))
				.administrator(true)
				.username("krobert151")
				.passwd(passwordEncoder.encode("krobert151"))
				.build();
		
		Usuario admin = Usuario.builder()
				.nombre("Admin")
				.apellidos("Admin")
				.correo("admin@gmail.com")
				.fechaNac(LocalDate.of(2004, 10, 12))
				.administrator(true)
				.username("admin")
				.passwd(passwordEncoder.encode("admin"))
				.build();
		
		repo.saveAll(List.of(usuario,krobert,admin));
		System.out.println(List.of(usuario,krobert,admin));
		
	}
	
	
}
