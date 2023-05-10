package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.salesianostriana.dam.bichopedia.model.Orden;
import com.salesianostriana.dam.bichopedia.services.ClaseService;
import com.salesianostriana.dam.bichopedia.services.OrdenService;

@Controller
public class OrdenController {

	@Autowired
	private OrdenService service;
	
	@Autowired
	private ClaseService claseService;
	
	@GetMapping("/ordenes")
	public String showOrdenes(Model model) {
		
		model.addAttribute("ordenList", service.findAll());
		
		return "orden/ordenes";
	}
	
	@GetMapping("/newOrden")
	public String nuevaOrden(Model model) {
		
		model.addAttribute("orden", new Orden());		
		model.addAttribute("clases", claseService.findAll());
		
		return "orden/ordenForm";
	}

	@PostMapping("/newOrden/submit")
	public String submitNuevaOrden(Orden orden, Model model) {
		service.save(orden);
		return "redirect:/ordenes";

	}
	
	
}
