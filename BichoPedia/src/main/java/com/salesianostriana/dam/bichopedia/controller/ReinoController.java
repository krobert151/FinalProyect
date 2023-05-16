package com.salesianostriana.dam.bichopedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.bichopedia.formbeans.SearchBean;
import com.salesianostriana.dam.bichopedia.model.Reino;
import com.salesianostriana.dam.bichopedia.services.ReinoService;

@Controller
@RequestMapping("/reinos/")
public class ReinoController {
	@Autowired
	private ReinoService service;
	
	@PostMapping("/search")
	public String buscarReinos(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		
		List<Reino>reinos;
		reinos=service.findByName(searchBean.getSearch());
		model.addAttribute("reinoList", reinos);
		return "reino/reinos";		
		
	}
	
	@GetMapping("/")
	public String showReinos(Model model) {
		
		model.addAttribute("reinoList", service.findAll());
		return "reino/reinos";
		
	}
	
	@GetMapping ("/orderBy/{orderBy}")
	public String verReinosSorted(@PathVariable String orderBy,Model model) {
		
		List<Reino>reinos;
		
		switch (orderBy) {
		
		case "nombreAsc":
			reinos = service.findAllSortedBy(Direction.ASC,"descripcion");
			break;
		case "nombreDesc":
			reinos = service.findAllSortedBy(Direction.ASC,"descripcion");
			break;
		case "cientificoAsc":
			reinos = service.findAllSortedBy(Direction.ASC,"nombre");
			break;
		case "cientificoDesc":
			reinos = service.findAllSortedBy(Direction.ASC,"nombre");
			break;

		default:
			reinos=service.findAll();		
		}
		
		model.addAttribute("reinoList", reinos);
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
	
	@GetMapping("/admin/gestReinos/{orderBy}")
	public String crudReinosSorted(Model model, @PathVariable String orderBy){
		
		List<Reino>reinos;
		
		switch(orderBy) {
		
		case "id":
			reinos = service.findAllSortedBy(Direction.ASC,"id");
			break;
		case "nombre":
			reinos = service.findAllSortedBy(Direction.ASC,"nombre");
			break;
		case "descripcion":
			reinos = service.findAllSortedBy(Direction.ASC,"descripcion");
			break;
		case "idDesc":
			reinos = service.findAllSortedBy(Direction.DESC,"id");
			break;
		case "nombreDesc":
			reinos = service.findAllSortedBy(Direction.DESC,"nombre");
			break;
		case "descripcionDesc":
			reinos = service.findAllSortedBy(Direction.DESC,"descripcion");
			break;
		default:
			reinos = service.findAll();		
		
		}
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
