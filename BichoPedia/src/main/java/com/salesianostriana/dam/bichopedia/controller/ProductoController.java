package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.services.ProductoService;

@Controller
public class ProductoController {

	@Autowired
	private ProductoService service;
	
	@GetMapping("/")
	public String listarProductos(Model model) {
		
		model.addAttribute("productList", service.getLista());
		
		return "tienda";
		
	}

	
	
}
