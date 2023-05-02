package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.repo.GeneroRepository;

@Controller
public class GeneroController {

	@Autowired 
	private GeneroRepository repo;
	
	@GetMapping("/generos")
	public String showGeneros(Model model) {
		
		model.addAttribute("generoList",repo.findAll());
		
		return "generos";
	}
	
}
