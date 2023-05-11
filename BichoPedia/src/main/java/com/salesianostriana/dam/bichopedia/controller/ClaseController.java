package com.salesianostriana.dam.bichopedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.bichopedia.model.Clase;
import com.salesianostriana.dam.bichopedia.model.Filo;
import com.salesianostriana.dam.bichopedia.services.ClaseService;
import com.salesianostriana.dam.bichopedia.services.FiloService;

@Controller
@RequestMapping("/clases/")
public class ClaseController {

	@Autowired
	private ClaseService service;
	
	@Autowired
	private FiloService filoService;
			
	@GetMapping("/")
	public String showCalses(Model model) {
		
		model.addAttribute("claseList",service.findAll());
		
		return "clase/clases";
		
	}
	@GetMapping("/newClase")
	public String nuevaClase(Model model) {
		
		model.addAttribute("clase", new Filo());		
		model.addAttribute("filos", filoService.findAll());
		
		return "clase/claseForm";
	}

	@PostMapping("/newClase/submit")
	public String submitNuevaClase(Clase clase, Model model) {
		service.save(clase);
		return "redirect:/clases/";

	}
	
	@GetMapping("/admin/gestClases")
	public String crudClases(Model model) {
		List<Clase>clases = service.findAll();
		model.addAttribute("clases", clases);
		return "admin/clases";
	}
	
	@GetMapping("/admin/gestClases/sortedName")
	public String crudClasesSortedName(Model model) {
		List<Clase>clases = service.sortedName();
		model.addAttribute("clases", clases);
		return "admin/clases";
	}
	
	@GetMapping("/admin/gestClases/sortedComun")
	public String crudClasesSortedComun(Model model) {
		List<Clase>clases = service.sortedComun();
		model.addAttribute("clases", clases);
		return "admin/clases";
	}
	
	@GetMapping("/admin/gestClases/sortedFil")
	public String crudClasesSortedFil(Model model) {
		List<Clase>clases = service.sortedFil();
		model.addAttribute("clases", clases);
		return "admin/clases";
	}

	@GetMapping("/admin/editarClase/{id}")
	public String mostrarFormularioEdicionClases(@PathVariable("id")long id,Model model) {
			Clase claseEdit = service.findById(id);
			
			if(claseEdit != null) {
				
				model.addAttribute("clase", claseEdit);
				model.addAttribute("filos", filoService.sortedName());
				return "clase/claseForm";
				
			}else
				return "redirect:/clases/gestClases";
	}
	
	@GetMapping("/admin/borrar/{id}")
	public String borrarClase(@PathVariable("id")long id) {
		service.deleteById(id);
		return "redirect:/clases/gestClases";
		
	}
	
	
}
