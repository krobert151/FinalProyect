/*package com.salesianostriana.dam.bichopedia;

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
				.fotoPerfil("https://assets.stickpng.com/images/585e4beacb11b227491c3399.png")
				.fechaNac(LocalDate.of(2000, 01, 01))
				.administrator(false)
				.username("user")
				.passwd(passwordEncoder.encode("1234"))
				.build();
		
		Usuario krobert = Usuario.builder()
				.nombre("Roberto")
				.apellidos("Rebolledo Naharro")
				.correo("robertorebolledo151@gmail.com")
				.fotoPerfil("https://www.anipedia.net/imagenes/clamidosaurio-de-king-800x375.jpg")
				.fechaNac(LocalDate.of(2004, 10, 12))
				.administrator(true)
				.username("krobert151")
				.passwd(passwordEncoder.encode("krobert151"))
				.build();
		
		Usuario admin = Usuario.builder()
				.nombre("Admin")
				.apellidos("Admin")
				.correo("admin@gmail.com")
				.fotoPerfil("https://assets.stickpng.com/images/585e4beacb11b227491c3399.png")
				.fechaNac(LocalDate.of(2004, 10, 12))
				.administrator(true)
				.username("admin")
				.passwd(passwordEncoder.encode("admin"))
				.build();
		
		Usuario cristina = Usuario.builder()
				.nombre("Cristina")
				.apellidos("Gutierrez Quintero")
				.correo("cristinagq03@gmail.com")
				.fotoPerfil("https://exoticsveterinaria.com/wp-content/uploads/2020/12/geko_leopardo_exotics.jpg")
				.fechaNac(LocalDate.of(2003, 03, 15))
				.administrator(false)
				.username("cristina03")
				.passwd(passwordEncoder.encode("cristina03"))
				.build();
		
		Usuario pablo = Usuario.builder()
				.nombre("Pablo")
				.apellidos("Valderass Mendez")
				.correo("pablovalmen@gmail.com")
				.fotoPerfil("https://img.freepik.com/vector-premium/ilustracion-cabeza-dragon-rojo_113398-564.jpg?w=360")
				.fechaNac(LocalDate.of(2003, 10, 2))
				.administrator(false)
				.username("ddrago666")
				.passwd(passwordEncoder.encode("ddrago666"))
				.build();
		
		Usuario lucia = Usuario.builder()
				.nombre("Lucía")
				.apellidos("Vázquez Ortiz")
				.correo("thenameless@gmail.com")
				.fotoPerfil("https://i1.sndcdn.com/artworks-JW8Slqda5P9KdNYO-Q1W1vg-t240x240.jpg")
				.fechaNac(LocalDate.of(2002, 03, 1))
				.administrator(false)
				.username("thenameless")
				.passwd(passwordEncoder.encode("thenameless"))
				.build();
		
		Usuario joselete = Usuario.builder()
				.nombre("José Ruiz")
				.apellidos("Ortiz ")
				.correo("joseleteort@gmail.com")
				.fotoPerfil("https://casarealespanola.files.wordpress.com/2015/09/felipe-ii.jpg")
				.fechaNac(LocalDate.of(2001, 01, 15))
				.administrator(false)
				.username("joseleteort")
				.passwd(passwordEncoder.encode("joseleteort"))
				.build();
		
		Usuario angel = Usuario.builder()
				.nombre("Ángel")
				.apellidos("Naranjo González")
				.correo("angel.naranjo@triana.salesianos.edu")
				.fotoPerfil("https://triana.salesianos.edu/wp-content/uploads/photo-gallery/2019.06.19._Despedida_Ciclos_Formativos_2019/20190619_DespedidaCiclos_4.jpg")
				.fechaNac(LocalDate.of(1976, 7, 15))
				.administrator(false)
				.username("angelng")
				.passwd(passwordEncoder.encode("angelng"))
				.build();
		
		Usuario luismi = Usuario.builder()
				.nombre("Luis Miguel")
				.apellidos("López Magaña")
				.correo("luismi.lopez@triana.salesianos.edu")
				.fotoPerfil("https://avatars.githubusercontent.com/u/34097584?v=4")
				.fechaNac(LocalDate.of(1980, 7, 10))
				.administrator(false)
				.username("mlopezmagana")
				.passwd(passwordEncoder.encode("mlopezmagana"))
				.build();
		

		Usuario miguel = Usuario.builder()
				.nombre("Miguel")
				.apellidos("Campos")
				.correo("miguel.campos@triana.salesianos.edu")
				.fotoPerfil("https://avatars.githubusercontent.com/u/1252111?v=4")
				.fechaNac(LocalDate.of(1978, 12, 25))
				.administrator(false)
				.username("mcampos")
				.passwd(passwordEncoder.encode("mcapos"))
				.build();
		
		Usuario rafa = Usuario.builder()
				.nombre("Rafael")
				.apellidos("Villar Liñan")
				.correo("rafael.villar@triana.salesianos.edu")
				.fotoPerfil("https://yt3.googleusercontent.com/ytc/AGIKgqO9ffclkeQoieYtqK4RHKtUKbdfUobD39aIRP8Skg=s900-c-k-c0x00ffffff-no-rj")
				.fechaNac(LocalDate.of(1973, 05, 23))
				.administrator(false)
				.username("rafavill")
				.passwd(passwordEncoder.encode("rafavill"))
				.build();
				
		Usuario juan = Usuario.builder()
				.nombre("Juan")
				.apellidos("González Pérez")
				.correo("juan.gonzalez@gmail.com")
				.fotoPerfil("https://xsgames.co/randomusers/assets/avatars/female/68.jpg")
				.fechaNac(LocalDate.of(1990, 06, 15))
				.administrator(false)
				.username("juang")
				.passwd(passwordEncoder.encode("juangonz"))
				.build();

		Usuario ana = Usuario.builder()
				.nombre("Ana")
				.apellidos("Martínez García")
				.correo("anamgarcia@hotmail.com")
				.fotoPerfil("https://xsgames.co/randomusers/assets/avatars/female/68.jpg")
				.fechaNac(LocalDate.of(1985, 02, 10))
				.administrator(true)
				.username("anamg")
				.passwd(passwordEncoder.encode("anamgarcia"))
				.build();

		Usuario carlos = Usuario.builder()
				.nombre("Carlos")
				.apellidos("Pérez Sánchez")
				.correo("carlosperez@gmail.com")
				.fotoPerfil("https://xsgames.co/randomusers/assets/avatars/male/50.jpg")
				.fechaNac(LocalDate.of(1978, 11, 20))
				.administrator(false)
				.username("carlosp")
				.passwd(passwordEncoder.encode("carlosperez"))
				.build();

		Usuario maria = Usuario.builder()
				.nombre("María")
				.apellidos("López García")
				.correo("marialopez@gmail.com")
				.fotoPerfil("https://xsgames.co/randomusers/assets/avatars/female/68.jpg")
				.fechaNac(LocalDate.of(1995, 03, 8))
				.administrator(false)
				.username("marialg")
				.passwd(passwordEncoder.encode("marialopez"))
				.build();

		Usuario pablo2 = Usuario.builder()
				.nombre("Pablo")
				.apellidos("Martín Sánchez")
				.correo("pabloms@hotmail.com")
				.fotoPerfil("https://xsgames.co/randomusers/assets/avatars/male/60.jpg")
				.fechaNac(LocalDate.of(1982, 06, 12))
				.administrator(false)
				.username("pabloms")
				.passwd(passwordEncoder.encode("pablomartin"))
				.build();

		Usuario laura = Usuario.builder()
				.nombre("Laura")
				.apellidos("García Rodríguez")
				.correo("lauragr@gmail.com")
				.fotoPerfil("https://xsgames.co/randomusers/assets/avatars/female/2.jpg")
				.fechaNac(LocalDate.of(1998, 10, 05))
				.administrator(true)
				.username("lauragr")
				.passwd(passwordEncoder.encode("lauragarcia"))
				.build();

		
		Usuario carla = Usuario.builder()
				.nombre("Carla")
				.apellidos("Fernández Ruiz")
				.correo("carlafr@gmail.com")
				.fotoPerfil("https://xsgames.co/randomusers/assets/avatars/female/2.jpg")
				.fechaNac(LocalDate.of(1992, 11, 18))
				.administrator(false)
				.username("carlafr")
				.passwd(passwordEncoder.encode("carlafernandez"))
				.build();

		Usuario javier = Usuario.builder()
				.nombre("Javier")
				.apellidos("González Martínez")
				.correo("javiergm@gmail.com")
				.fotoPerfil("https://xsgames.co/randomusers/assets/avatars/male/60.jpg")
				.fechaNac(LocalDate.of(1987, 07, 25))
				.administrator(true)
				.username("javiergm")
				.passwd(passwordEncoder.encode("javiergonzalez"))
				.build();

		Usuario sofia = Usuario.builder()
				.nombre("Sofía")
				.apellidos("Ramos García")
				.correo("sofiarg@hotmail.com")
				.fotoPerfil("https://xsgames.co/randomusers/assets/avatars/female/76.jpg")
				.fechaNac(LocalDate.of(1996, 01, 30))
				.administrator(false)
				.username("sofiarg")
				.passwd(passwordEncoder.encode("sofiaramos"))
				.build();

				

				

		
		repo.saveAll(List.of(usuario,krobert,admin,ana,angel,carla,carlos,cristina,javier,joselete,juan,laura,lucia,luismi,maria,miguel,pablo,pablo2,rafa,sofia));
		
		
	}
	
	
}
*/