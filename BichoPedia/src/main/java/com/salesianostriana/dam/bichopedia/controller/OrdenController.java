package com.salesianostriana.dam.bichopedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.bichopedia.model.Orden;
import com.salesianostriana.dam.bichopedia.services.ClaseService;
import com.salesianostriana.dam.bichopedia.services.OrdenService;

@Controller
@RequestMapping("/ordenes/")
public class OrdenController {

	@Autowired
	private OrdenService service;
	
	@Autowired
	private ClaseService claseService;
	
	@GetMapping("/")
	public String showOrdenes(Model model) {
		
		model.addAttribute("ordenList", service.findAll());
		
		return "orden/ordenes";
	}
	
	@GetMapping("/newOrden")
	public String nuevaOrden(Model model) {
		
		model.addAttribute("orden", new Orden());		
		model.addAttribute("clases", claseService.findAll());
		
		return "orden/ordenForm";
	}

	@PostMapping("/newOrden/submit")
	public String submitNuevaOrden(Orden orden, Model model) {
		service.save(orden);
		return "redirect:/ordenes/";

	}
	
	@GetMapping("/gestOrdenes")
	public String crudOrdenes(Model model) {
		List<Orden> ordenes = service.findAll();
		model.addAttribute("ordenes", ordenes);
		return "admin/ordenes";
		
	}
	@GetMapping("/gestOrdenes/sortedName")
	public String crudOrdenesSortedName(Model model) {
		List<Orden> ordenes = service.sortedName();
		model.addAttribute("ordenes", ordenes);
		return "admin/ordenes";
		
	}
	@GetMapping("/gestOrdenes/sortedComun")
	public String crudOrdenesSortedComun(Model model) {
		List<Orden> ordenes = service.sortedComunN();
		model.addAttribute("ordenes", ordenes);
		return "admin/ordenes";
		
	}
	@GetMapping("/gestOrdenes/sortedCla")
	public String crudOrdenesSortedCla(Model model) {
		List<Orden> ordenes = service.sortedCla();
		model.addAttribute("ordenes", ordenes);
		return "admin/ordenes";
		
	}
	@GetMapping("/editarOrden/{id}")
	public String mostrarFormularioEdicionOrdenes(@PathVariable("id")long id, Model model) {
		Orden ordenEdit = service.findById(id);
		
		if(ordenEdit != null) {
			
			model.addAttribute("orden", ordenEdit);
			model.addAttribute("clases", claseService.sortedName());
			return "orden/ordenForm";
			
		}else
			return "redirect:/ordenes/gestOrdenes";
		
	}
	@GetMapping("borrar/{id}")
	public String borrarOrden(@PathVariable("id")long id) {
		service.deleteById(id);
		return "redirect:/ordenes/gestOrdenes";
	}
	
	
}
