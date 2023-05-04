package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.services.GeneroService;

@Controller
public class GeneroController {

	@Autowired 
	private GeneroService service;
	
	@GetMapping("/generos")
	public String showGeneros(Model model) {
		
		model.addAttribute("generoList",service.findAll());
		
		return "generos";
	}
	
}
