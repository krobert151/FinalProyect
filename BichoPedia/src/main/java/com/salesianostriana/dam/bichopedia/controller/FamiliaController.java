package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.services.FamiliaService;

@Controller
public class FamiliaController {

	@Autowired
	private FamiliaService service;
	
	@GetMapping("/familias")
	public String showFamilias(Model model) {
		
		model.addAttribute("familiaList", service.findAll());
		
		return ("familias");
	}
	
}
