package com.salesianostriana.dam.bichopedia.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.model.Especie;
import com.salesianostriana.dam.bichopedia.model.Genero;
import com.salesianostriana.dam.bichopedia.repo.GeneroRepository;

@Controller
public class EspecieController {
	
	
	@Autowired
	private GeneroRepository generoRepo;
	
	@GetMapping("/especies")
	public String verEspecies(Model model) {
		
		List<Especie> especies = new ArrayList<>();
		List<Genero> generos = generoRepo.findAllJoin();
		
		for (Genero genero : generos) {
			especies.addAll(genero.getEspecies());
		}
		
		model.addAttribute("especieList", especies);
		
		return "especies";
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
