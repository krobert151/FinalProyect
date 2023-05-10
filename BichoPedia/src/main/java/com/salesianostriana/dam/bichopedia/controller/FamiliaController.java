package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.salesianostriana.dam.bichopedia.model.Familia;
import com.salesianostriana.dam.bichopedia.services.FamiliaService;
import com.salesianostriana.dam.bichopedia.services.OrdenService;

@Controller
public class FamiliaController {

	@Autowired
	private FamiliaService service;
	
	@Autowired 
	private OrdenService ordenService;
	
	@GetMapping("/familias")
	public String showFamilias(Model model) {
		
		model.addAttribute("familiaList", service.findAll());
		
		return "familia/familias";
	}
	
	@GetMapping("/newFamilia")
	public String nuevaFamilia(Model model) {
		
		model.addAttribute("familia", new Familia());		
		model.addAttribute("ordenes", ordenService.findAll());
		
		return "familia/familiaForm";
	}

	@PostMapping("/newFamilia/submit")
	public String submitNuevaFamilia(Familia familia, Model model) {
		service.save(familia);
		return "redirect:/familias";

	}
	
	
}
