package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.repo.FiloRepository;

@Controller
public class FiloController {

	@Autowired
	private FiloRepository repo;
	
	@GetMapping("/filos")
	public String showFilos (Model model) {
		
		model.addAttribute("filoList", repo.findAll());
		
		return "filos";
		
	} 
	
	
}
