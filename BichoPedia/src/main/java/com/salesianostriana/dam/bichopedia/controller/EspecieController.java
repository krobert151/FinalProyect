package com.salesianostriana.dam.bichopedia.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.bichopedia.model.Especie;
import com.salesianostriana.dam.bichopedia.services.EspecieService;
import com.salesianostriana.dam.bichopedia.services.GeneroService;

@Controller
public class EspecieController {
	
	
	@Autowired
	private EspecieService service;
	
	@Autowired 
	private GeneroService genServcie;
	
	@GetMapping("/especies")
	public String verEspecies(Model model) {
	    List<Especie> especies = service.findAll();
	    Collections.shuffle(especies);
	    model.addAttribute("especieList", especies);
	    return "especie/especies";
	}
	
	@GetMapping("/newEspecie")
	public String nuevaEspecie(Model model) {
		
		model.addAttribute("especie", new Especie());
		model.addAttribute("generos", genServcie.findAll());
		return "especie/especieForm";
	}

	@PostMapping("/newEspecie/submit")
	public String submitNuevoEspecie(Especie especie, Model model) {

		service.save(especie);
		return "redirect:/especies";

	}
	
	
	
}
