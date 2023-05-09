package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.bichopedia.model.Clase;
import com.salesianostriana.dam.bichopedia.model.Filo;
import com.salesianostriana.dam.bichopedia.services.ClaseService;
import com.salesianostriana.dam.bichopedia.services.FiloService;
import com.salesianostriana.dam.bichopedia.services.ReinoService;

@Controller
public class ClaseController {

	@Autowired
	private ClaseService service;
	
	@Autowired
	private FiloService filoService;
	
	@Autowired 
	private ReinoService reinoService;
	
	@GetMapping("/clases")
	public String showCalses(Model model) {
		
		model.addAttribute("claseList",service.findAll());
		
		return "clase/clases";
		
	}
	@GetMapping("/newClase")
	public String nuevaClase(Model model) {
		
		model.addAttribute("clase", new Filo());		
		model.addAttribute("filos", filoService.findAll());
		//model.addAttribute("reinos", reinoService.findAll());
		
		return "clase/claseForm";
	}

	@PostMapping("/newClase/submit")
	public String submitNuevaClase(Clase clase, Model model) {
		service.save(clase);
		return "redirect:/clases";

	}
	
}
