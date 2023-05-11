package com.salesianostriana.dam.bichopedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.bichopedia.model.Familia;
import com.salesianostriana.dam.bichopedia.services.FamiliaService;
import com.salesianostriana.dam.bichopedia.services.OrdenService;

@Controller
@RequestMapping("/familias/")
public class FamiliaController {

	@Autowired
	private FamiliaService service;
	
	@Autowired 
	private OrdenService ordenService;
	
	@GetMapping("/")
	public String showFamilias(Model model) {
		
		model.addAttribute("familiaList", service.findAll());
		
		return "familia/familias";
	}
	
	@GetMapping("/newFamilia")
	public String nuevaFamilia(Model model) {
		
		model.addAttribute("familia", new Familia());		
		model.addAttribute("ordenes", ordenService.findAll());
		
		return "familia/familiaForm";
	}

	@PostMapping("/newFamilia/submit")
	public String submitNuevaFamilia(Familia familia, Model model) {
		service.save(familia);
		return "redirect:/familias/";

	}
	
	@GetMapping("/admin/gestFamilias")
	public String curdFamilias(Model model) {
		List<Familia> familias = service.findAll();
		model.addAttribute("familias", familias);
		return "admin/familias";		
		
	}
	
	@GetMapping("/admin/gestFamilias/sortedName")
	public String crudFamiliasSortedName(Model model) {
		List<Familia> familias = service.sortedName();
		model.addAttribute("familias", familias);
		return "admin/familias";
		
	}
	
	@GetMapping("/admin/gestFamilias/sortedOrd")
	public String crudFamiliasSortedOrd(Model model) {
		List<Familia> familias = service.sortedOrd();
		model.addAttribute("familias", familias);
		return "admin/familias";	
		
	}
	@GetMapping("/admin/gestFamilias/sortedComun")
	public String crudFamiliasSortedComun(Model model) {
		List<Familia>familias=service.sortedComunN();
		model.addAttribute("familias", familias);
		return "admin/familias";
		
	}
	
	@GetMapping("/admin/editarFamilia/{id}")
	public String mostrarFormularioEdicionFamilias(@PathVariable("id")long id,Model model) {
		Familia familiaEdit = service.findById(id);
		
		if(familiaEdit != null) {
			model.addAttribute("familia", familiaEdit);
			model.addAttribute("ordenes", ordenService.sortedName());
			return "familia/familiaForm";
		}else
			return "redirect:/familias/gestFamilias";
		
	}
	@GetMapping("/admin/borrar/{id}")
	public String borrarFamilia(@PathVariable("id")long id) {
		
		service.deleteById(id);
		return "redirect:/familias/gestFamilias";
		
	}
	
}
