package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.bichopedia.model.Usuario;
import com.salesianostriana.dam.bichopedia.services.UsuarioService;

@Controller
public class RegisterController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/register")
	public String register (Model model) {
		
		Usuario usuario = new Usuario();
		model.addAttribute("registerForm", usuario);		
		return "register";
	}
	
	@PostMapping("/registerOk")
	public String nuevoUsuario (@ModelAttribute("registerForm") Usuario usuario) {
		usuarioService.save(usuario);
		return "redirect:/";
	} 
	
	
}
