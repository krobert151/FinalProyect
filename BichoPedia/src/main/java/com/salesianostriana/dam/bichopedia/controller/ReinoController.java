package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.bichopedia.model.Reino;
import com.salesianostriana.dam.bichopedia.services.ReinoService;

@Controller
public class ReinoController {
	@Autowired
	private ReinoService service;
	
	@GetMapping("/reinos")
	public String showReinos(Model model) {
		
		model.addAttribute("reinoList", service.findAll());
		
		return "reino/reinos";
	}
	
	@GetMapping("/newReino")
	public String newReino(Model model) {
		
		model.addAttribute("reino", new Reino());

		return "reino/reinoForm";
	}

	@PostMapping("/newReino/submit")
	public String submitNewReino(Reino reino, Model model) {
		service.save(reino);
		return "redirect:/reinos";

	}
	
}
