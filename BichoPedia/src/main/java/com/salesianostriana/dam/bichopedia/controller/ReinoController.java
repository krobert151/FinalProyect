package com.salesianostriana.dam.bichopedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.bichopedia.model.Reino;
import com.salesianostriana.dam.bichopedia.services.ReinoService;

@Controller
@RequestMapping("/reinos/")
public class ReinoController {
	@Autowired
	private ReinoService service;
	
	@GetMapping("/")
	public String showReinos(Model model) {
		
		model.addAttribute("reinoList", service.findAll());
		
		return "reino/reinos";
	}
	
	@GetMapping("/newReino")
	public String newReino(Model model) {
		
		model.addAttribute("reino", new Reino());

		return "reino/reinoForm";
	}

	@PostMapping("/newReino/submit")
	public String submitNewReino(Reino reino, Model model) {
		service.save(reino);
		return "redirect:/reinos/";

	}
	
	@GetMapping("/admin/gestReinos")
	public String crudReinos(Model model) {
		List<Reino>reinos=service.findAll();
		model.addAttribute("reinos", reinos);
		return "admin/reinos";
			
	}
	
	@GetMapping("/admin/gestReinos/sortedName")
	public String crudReinosSortedName(Model model) {
		List<Reino>reinos=service.sortedName();
		model.addAttribute("reinos", reinos);
		return "admin/reinos";
		
	}
	
	@GetMapping("/admin/gestReinos/sortedComun")
	public String crudReinosSortedComun(Model model) {
		List<Reino>reinos=service.sortedComunN();
		model.addAttribute("reinos", reinos);
		return "admin/reinos";
		
	}
	
	@GetMapping("/admin/editarReino/{id}")
	public String mostrarFormularioEdicionReinos(@PathVariable("id")long id,Model model) {
		
		Reino reinoEdit=service.findById(id);
		
		if(reinoEdit!=null) {
			model.addAttribute("reino",reinoEdit);
			return "reino/reinoForm";			
		}else {
			return "redirect:/reinos/gestReinos";
		}
		
		
	}
	@GetMapping("/admin/borrar/{id}")
	public String borrarReino(@PathVariable("id")long id) {
		service.deleteById(id);
		return "redirect:/reinos/gestReinos";
	}
	
}
