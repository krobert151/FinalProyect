package com.salesianostriana.dam.bichopedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.bichopedia.model.Encuentro;
import com.salesianostriana.dam.bichopedia.model.Especie;
import com.salesianostriana.dam.bichopedia.model.Usuario;
import com.salesianostriana.dam.bichopedia.services.EncuentroService;
import com.salesianostriana.dam.bichopedia.services.EspecieService;

@Controller
public class EncuentoController {
	
	@Autowired
	private EncuentroService service;
	
	@GetMapping("/encuentros")
	public String encuentros(Model model) {
		
		model.addAttribute("encuentroList", service.findAll());
		
		return "encuentros";
	}
	@Autowired
	private EspecieService espService ;
	
	
	@GetMapping("/registro")
	public String registro(@AuthenticationPrincipal Usuario u, Model model) {
		List<Especie>especies = espService.sortedName();
		model.addAttribute("usuario", u);
		model.addAttribute("encuentro", new Encuentro());
		model.addAttribute("especies", especies);
		
		return "encuentro/encuentroForm";
		
	}
	
	@PostMapping("/registroOk")
	public String registroFinalizado(@ModelAttribute("encuentroForm") 
	Encuentro encuentro, Model model ) {
		
		model.addAttribute("encuentro", model);
		
		return "registroOk";
	};
	
}
