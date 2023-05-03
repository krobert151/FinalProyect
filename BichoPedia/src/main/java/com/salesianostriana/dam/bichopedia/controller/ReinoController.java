package com.salesianostriana.dam.bichopedia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.repo.ReinoRepository;

@Controller
public class ReinoController {
	@Autowired
	private ReinoRepository repo;
	
	@GetMapping("/reinos")
	public String showReinos(Model model) {
		
		model.addAttribute("reinoList", repo.findAll());
		
		
		return "reinos";
	}
	
}
