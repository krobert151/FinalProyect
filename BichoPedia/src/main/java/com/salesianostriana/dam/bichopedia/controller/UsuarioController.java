package com.salesianostriana.dam.bichopedia.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.bichopedia.model.Usuario;
import com.salesianostriana.dam.bichopedia.services.UsuarioService;

@Controller
@RequestMapping("/admin/")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("usuarios")
	public String listarUsuarios(Model model) {
		
		model.addAttribute("userList", usuarioService.findAll());
		return "/admin/usuarios";
		
	}
	
	@GetMapping("newUser")
	public String nuevoUsuario(Model model) {
		
		model.addAttribute("usuario",new Usuario());
		
		return "formularioUsuario";
		
	}
	
	@PostMapping("/newUser/submit")
	public String procesarUsuario(@ModelAttribute("usuario")Usuario usuario) {
		usuarioService.save(usuario);	
		return "redirect:/admin/usuarios";
		
	}
	
	
	@GetMapping("/editarUsuario/{id}")
	public String mostrarFormularioEdicion(@PathVariable("id") long id, Model model) {
		
		Usuario userEdit = usuarioService.findById(id);
		
		if(userEdit != null) {
			model.addAttribute("usuario", userEdit);
			return "/admin/formularioUsuario";
			
		}else {
			return "redirect:/admin/usuarios";
		}
		
	}
	@PostMapping("/usuarios/editar")
	public String editarUsuario(@ModelAttribute("usuario") Usuario usuario) {
	    // Obtener el usuario existente desde la base de datos
	    Optional<Usuario> usuarioExistente = Optional.ofNullable(usuarioService.findById(usuario.getId()));
	    
	    if (usuarioExistente.isPresent()) {
	        // Actualizar los campos relevantes de la entidad de usuario
	        Usuario usuarioActualizado = usuarioExistente.get();
	        usuarioActualizado.setId(usuario.getId());
	        usuarioActualizado.setNombre(usuario.getNombre());
	        usuarioActualizado.setApellidos(usuario.getApellidos());
	        usuarioActualizado.setCorreo(usuario.getCorreo());
	        usuarioActualizado.setFechaNac(usuario.getFechaNac());
	        usuarioActualizado.setUsername(usuario.getUsername());
	        usuarioActualizado.setPasswd(usuario.getPasswd());
	        usuarioActualizado.setAdministrator(usuario.isAdministrator());

	        // Guardar la entidad de usuario actualizada en la base de datos
	        usuarioService.save(usuarioActualizado);
		return "redirect:/admin/usuarios";	
	    } else {
	        return "redirect:/admin/usuarios";
	    }
	}
	
	@GetMapping("/borrar/{id}")
	public String borrarUsuario(@PathVariable("id")long id) {
		usuarioService.deleteById(id);
		return "redirect:/admin/usuarios";		

		
	}
	
	
}
