package com.salesianostriana.dam.bichopedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.bichopedia.model.Filo;
import com.salesianostriana.dam.bichopedia.services.FiloService;
import com.salesianostriana.dam.bichopedia.services.ReinoService;

@Controller
@RequestMapping("/filos/")
public class FiloController {

	@Autowired
	private FiloService service;
	
	@Autowired
	private ReinoService reinoService;
	
	@GetMapping("/")
	public String showFilos (Model model) {
		
		model.addAttribute("filoList", service.findAll());
		return "filo/filos";
		
	} 
	@GetMapping("/newFilo")
	public String nuevoFilo(Model model) {
		
		model.addAttribute("filo", new Filo());		
		model.addAttribute("reinos", reinoService.findAll());
		return "filo/filoForm";
	}

	@PostMapping("/newFilo/submit")
	public String submitNuevoFilo(Filo filo, Model model) {
		service.save(filo);
		return "redirect:/filos/";

	}
	@GetMapping("/admin/gestFilos")
	public String crudFilo(Model model) {
		List<Filo>filos = service.findAll();
		model.addAttribute("filos", filos);
		return "admin/filos";
	
	}
	
	@GetMapping("/admin/gestFilos/sortedName")
	public String crudFiloSortedName(Model model) {
		List<Filo>filos = service.sortedName();
		model.addAttribute("filos", filos);
		return "admin/filos";
		
	}
	
	@GetMapping("/admin/gestFilos/sortedComun")
	public String crudFiloSortedComun(Model model) {
		List<Filo>filos = service.sortedComunN();
		model.addAttribute("filos", filos);
		return "admin/filos";
		
	}
	
	@GetMapping("/gestFilos/sortedReino")
	public String crudFiloSortedRei(Model model) {
		List<Filo>filos = service.sortedReino();
		model.addAttribute("filos", filos);
		return "admin/filos";
		
	}
	
	@GetMapping("/admin/editarFilo/{id}")
	public String mostrarFormularioEdicionFilos(@PathVariable("id")long id,Model model) {
		Filo filoEdit = service.findById(id);
		
		if(filoEdit!=null) {
			model.addAttribute("filo", filoEdit);
			model.addAttribute("reinos", reinoService.findAll());
			return "filo/filoForm";			
		}else
			return "redirect:/clases/gestClases";
		
	}
	@GetMapping("/admin/borrar/{id}")
	public String borrarFilo(@PathVariable("id")long id) {
		service.deleteById(id);
		return "redirect:/filos/gestFilos";
	}
	
}
