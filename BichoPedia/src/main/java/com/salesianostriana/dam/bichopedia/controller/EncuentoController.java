package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.services.EncuentroService;

@Controller
public class EncuentoController {
	
	@Autowired
	private EncuentroService service;
	
	@GetMapping("/encuentros")
	public String encuentros(Model model) {
		
		model.addAttribute("encuentroList", service.findAll());
		
		return "encuentros";
	}
	
}
