package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.repo.ClaseRepository;

@Controller
public class ClaseController {

	@Autowired
	private ClaseRepository repo;
	
	@GetMapping("/clases")
	public String showCalses(Model model) {
		
		model.addAttribute("claseList",repo.findAll());
		
		return "clases";
		
	}
	
}
