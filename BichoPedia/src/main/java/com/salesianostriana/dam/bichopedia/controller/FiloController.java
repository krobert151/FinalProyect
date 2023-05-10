package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.bichopedia.model.Filo;
import com.salesianostriana.dam.bichopedia.services.FiloService;
import com.salesianostriana.dam.bichopedia.services.ReinoService;

@Controller
public class FiloController {

	@Autowired
	private FiloService service;
	
	@Autowired
	private ReinoService reinoService;
	
	@GetMapping("/filos")
	public String showFilos (Model model) {
		
		model.addAttribute("filoList", service.findAll());
		
		return "filo/filos";
		
	} 
	@GetMapping("/newFilo")
	public String nuevoFilo(Model model) {
		
		model.addAttribute("filo", new Filo());		
		model.addAttribute("reinos", reinoService.findAll());
		return "filo/filoForm";
	}

	@PostMapping("/newFilo/submit")
	public String submitNuevoFilo(Filo filo, Model model) {
		service.save(filo);
		return "redirect:/filos";

	}
	
}
