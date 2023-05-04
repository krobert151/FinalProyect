package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.services.OrdenService;

@Controller
public class OrdenController {

	@Autowired
	private OrdenService service;
	
	@GetMapping("/ordenes")
	public String showOrdenes(Model model) {
		
		model.addAttribute("ordenList", service.findAll());
		
		return "ordenes";
	}
	
}
