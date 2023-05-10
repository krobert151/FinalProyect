package com.salesianostriana.dam.bichopedia.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.bichopedia.model.Especie;
import com.salesianostriana.dam.bichopedia.services.EspecieService;
import com.salesianostriana.dam.bichopedia.services.GeneroService;

@Controller
@RequestMapping("/especies/")
public class EspecieController {
	
	
	@Autowired
	private EspecieService service;
	
	@Autowired 
	private GeneroService genServcie;
	
	@GetMapping("/")
	public String verEspecies(Model model) {
	    List<Especie> especies = service.findAll();
	    Collections.shuffle(especies);
	    model.addAttribute("especieList", especies);
	    return "especie/especies";
	}
	
	@GetMapping("/newEspecie")
	public String nuevaEspecie(Model model) {
		
		model.addAttribute("especie", new Especie());
		model.addAttribute("generos", genServcie.sortedName());
		return "especie/especieForm";
	}

	@PostMapping("/newEspecie/submit")
	public String submitNuevoEspecie(Especie especie, Model model) {

		service.save(especie);
		return "redirect:/especies/";

	}
	@GetMapping("/gestEspecies")
	public String crudEspecies(Model model) {
		List<Especie> especies = service.findAll();
		
		model.addAttribute("especies", especies);
		return "admin/especies";
	}
	@GetMapping("/gestEspecies/sortedName")	
	public String crudEspeciesSortedName(Model model) {
		List<Especie> especies = service.sortedName();
		
		model.addAttribute("especies", especies);
		return "admin/especies";
			
	}
	
	@GetMapping("/gestEspecies/sortedGen")	
	public String crudEspeciesSortedGen(Model model) {
		List<Especie> especies = service.sortedGen();
		model.addAttribute("especies", especies);
		return "admin/especies";
		
	}
	
	@GetMapping("/gestEspecies/sortedComun")
	public String crudEspeciesSortedComunName(Model model) {
		List<Especie> especies = service.sortedComunN();
		model.addAttribute("especies", especies);
		return "admin/especies";
	}
	
	@GetMapping("/editarEspecie/{id}")
	public String mostrarFormularioEdicionEspecie(@PathVariable("id") long id, Model model) {
		Especie especieEdit= service.findById(id);
		
		if(especieEdit != null) {
			model.addAttribute("especie", especieEdit);
			model.addAttribute("generos", genServcie.sortedName());
			return "especie/especieForm";
		}else
			return "redirect:/especies/gestEspecies";
			
		
	}
	
	@GetMapping("/borrar/{id}")
	public String borrarEspecie(@PathVariable("id")long id) {
		service.deleteById(id);
		return "redirect:/especies/gestEspecies";
		
		
		
	}
	
	
	
}
