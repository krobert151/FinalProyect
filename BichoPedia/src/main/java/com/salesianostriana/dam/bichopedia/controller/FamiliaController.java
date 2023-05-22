package com.salesianostriana.dam.bichopedia.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.bichopedia.formbeans.SearchBean;
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
	
	@PostMapping("/search")
	public String buscarFamilia(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		
		List<Familia>familias;
		familias = service.findByName(searchBean.getSearch());
		model.addAttribute("familiaList", familias);
		return "familia/familias";
		
		
	}
	@PostMapping("/admin/search")
	public String buscarFamiliaAdmin(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		
		List<Familia>familias;
		familias = service.findByName(searchBean.getSearch());
		model.addAttribute("familias", familias);
		return "admin/familias";
		
		
	}
	
	
	@GetMapping("/")
	public String showFamilias(@RequestParam(name="ordenId", required=false)Long ordenId,  Model model) {
		
		List<Familia> familias;
		
		if(ordenId==null) {
			
			familias= service.findAll();
			
		}else {
			familias=service.findAllByOrdenId(ordenId);
		}
		model.addAttribute("familiaList", familias);
		
		return "familia/familias";
	}
	
	@GetMapping("/orderBy/{orderBy}")
	public String verFamiliasSorted(@PathVariable String orderBy,Model model) {
		
		List<Familia>familias;
		switch (orderBy) {
		
		case "nombreAsc":
			familias = service.findAllSorted(Direction.ASC,"descripcion");
			break;
		case "nombreDesc":
			familias = service.findAllSorted(Direction.DESC,"descripcion");
			break;
		case "cientificoAsc":
			familias = service.findAllSorted(Direction.ASC,"nombre");
			break;
		case "cientificoDesc":
			familias = service.findAllSorted(Direction.DESC,"nombre");
			break;
		case "ordenAsc":
			familias = service.findAllSorted(Direction.ASC,"orden.nombre");
			break;
		case "ordenDesc":
			familias = service.findAllSorted(Direction.DESC,"orden.nombre");
			break;
		default:
			familias=service.findAll();		
		}
		model.addAttribute("familiaList", familias);
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
	
	@GetMapping("/admin/gestFamilias/{orderBy}")
	public String crusFamiliasSorted(Model model,@PathVariable String orderBy) {
		
		List<Familia>familias;
		
		switch(orderBy) {
		
		case "id":
			familias = service.findAllSorted(Direction.ASC,"id");
			break;
		case "nombre":
			familias = service.findAllSorted(Direction.ASC,"nombre");
			break;
		case "descripcion":
			familias = service.findAllSorted(Direction.ASC,"descripcion");
			break;
		case "orden":
			familias = service.findAllSorted(Direction.ASC,"orden.nombre");
			break;
		case "idDesc":
			familias = service.findAllSorted(Direction.DESC,"id");
			break;
		case "nombreDesc":
			familias = service.findAllSorted(Direction.DESC,"nombre");
			break;
		case "descripcionDesc":
			familias = service.findAllSorted(Direction.DESC,"descripcion");
			break;
		case "ordenDesc":
			familias = service.findAllSorted(Direction.DESC,"orden.nombre");
			break;
		default:
			familias= service.findAll();
		
		
		}
		model.addAttribute("familias", familias);
		return "admin/familias";
		
		
	}
	
	@GetMapping("/admin/editarFamilia/{id}")
	public String mostrarFormularioEdicionFamilias(@PathVariable("id")long id,Model model) {
		Optional<Familia> familiaEdit = service.findById(id);
		
		if(familiaEdit.isPresent()) {
			model.addAttribute("familia", familiaEdit.get());
			model.addAttribute("ordenes", ordenService.findAllBySorted(Direction.ASC,"nombre"));
			return "familia/familiaForm";
		}else
			return "redirect:/familias/gestFamilias";
		
	}
	@GetMapping("/admin/borrar/{id}")
	public String borrarFamilia(@PathVariable("id")long id) {
		
		service.deleteById(id);
		return "redirect:/familias/admin/gestFamilias/id";
		
	}
	
}
