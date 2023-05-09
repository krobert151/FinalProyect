package com.salesianostriana.dam.bichopedia.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.model.Especie;
import com.salesianostriana.dam.bichopedia.services.EspecieService;

@Controller
public class EspecieController {
	
	
	@Autowired
	private EspecieService service;
	
	@GetMapping("/especies")
	public String verEspecies(Model model) {
	    List<Especie> especies = service.findAll();
	    Collections.shuffle(especies);
	    model.addAttribute("especieList", especies);
	    return "especies";
	}
	
	@GetMapping("/newEspecie")
	public String newEspecie(Model model) {
		
		model.addAttribute("especia", new Especie());
		
		return "newEspecie";
		
	}
	
	
}
