package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.repo.FamiliaRepository;

@Controller
public class FamiliaController {

	@Autowired
	private FamiliaRepository repo;
	
	@GetMapping("/familias")
	public String showFamilias(Model model) {
		
		model.addAttribute("familiaList", repo.findAll());
		
		return ("familias");
	}
	
}
