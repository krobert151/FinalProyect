package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.bichopedia.model.Familia;
import com.salesianostriana.dam.bichopedia.model.Genero;
import com.salesianostriana.dam.bichopedia.services.FamiliaService;
import com.salesianostriana.dam.bichopedia.services.GeneroService;

@Controller
public class GeneroController {

	@Autowired 
	private GeneroService service;
	
	@Autowired 
	private FamiliaService familiaService;
	
	
	@GetMapping("/generos")
	public String showGeneros(Model model) {
		
		model.addAttribute("generoList",service.findAll());
		
		return "genero/generos";
	}
	
	@GetMapping("/newGenero")
	public String nuevoGenero(Model model) {
		
		model.addAttribute("genero", new Genero());		
		model.addAttribute("familias", familiaService.findAll());
		
		return "genero/generoForm";
	}

	@PostMapping("/newGenero/submit")
	public String submitNuevoGenero(Genero genero, Model model) {
		service.save(genero);
		return "redirect:/generos";

	}
	
}
