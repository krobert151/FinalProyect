package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.bichopedia.model.Encuentro;

@Controller
public class RegistroController {

	@GetMapping("/registro")
	public String registro(Model model) {
		Encuentro encuentro = new Encuentro();
		model.addAttribute("encuentroForm", encuentro);
		
		return "registro";
		
	}
	
	@PostMapping("/registroOk")
	public String registroFinalizado(@ModelAttribute("encuentroForm") 
	Encuentro encuentro, Model model ) {
		
		model.addAttribute("encuentro", model);
		
		return "registroOk";
	};
	
}
