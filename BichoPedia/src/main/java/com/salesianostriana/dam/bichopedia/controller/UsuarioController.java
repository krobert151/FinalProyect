package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.bichopedia.model.Usuario;
import com.salesianostriana.dam.bichopedia.services.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("usuarios")
	public String listarUsuarios(Model model) {
		
		model.addAttribute("userList", usuarioService.findAll());
		return "usuarios";
		
	}
	
	@GetMapping("newUser")
	public String nuevoUsuario(Model model) {
		
		model.addAttribute("usuario",new Usuario());
		
		return "formularioUsuario";
		
	}
	
	@PostMapping("/newUser/submit")
	public String procesarUsuario(@ModelAttribute("usuario")Usuario usuario) {
		usuarioService.save(usuario);	
		return "redirect:/usuarios";
		
	}
	
	
	@GetMapping("/editarUsuario/{id}")
	public String mostrarFormularioEdicion(@PathVariable("id") long id, Model model) {
		
		Usuario userEdit = usuarioService.findById(id);
		
		if(userEdit != null) {
			model.addAttribute("usuario", userEdit);
			return "formularioUsuario";
			
		}else {
			return "redirect:/usuarios";
		}
		
	}
	@PostMapping("/editar/submit")
	public String procesarEdit(@ModelAttribute("usuario")Usuario usuario) {
		usuarioService.edit(usuario);
		return "redirect:/usuarios";		
	}
	
	@GetMapping("/borrar/{id}")
	public String borrarUsuario(@PathVariable("id")long id) {
		usuarioService.deleteById(id);
		return "redirect:/usuarios";		

		
	}
	
	
}
