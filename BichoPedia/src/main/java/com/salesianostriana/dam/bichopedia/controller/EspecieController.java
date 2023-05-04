package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.services.EspecieService;

@Controller
public class EspecieController {
	
	
	@Autowired
	private EspecieService service;
	
	@GetMapping("/especies")
	public String verEspecies(Model model) {
		
		model.addAttribute("especieList", service.findAll());
		
		return "especies";
	}
	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
		
	}
	
}
