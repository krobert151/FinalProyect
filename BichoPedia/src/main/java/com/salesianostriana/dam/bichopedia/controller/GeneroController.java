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
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.bichopedia.formbeans.SearchBean;
import com.salesianostriana.dam.bichopedia.model.Genero;
import com.salesianostriana.dam.bichopedia.services.FamiliaService;
import com.salesianostriana.dam.bichopedia.services.GeneroService;

@Controller
@RequestMapping("/generos/")
public class GeneroController {

	@Autowired 
	private GeneroService service;
	
	@Autowired 
	private FamiliaService familiaService;
	
	@PostMapping("/search")
	public String buscarGenero(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		
		List<Genero>generos;
		generos = service.findByName(searchBean.getSearch());
		model.addAttribute("generoList", generos);
		return "genero/generos";
		
		
	}
	@PostMapping("/admin/search")
	public String buscarGeneroAdmin(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		
		List<Genero>generos;
		generos = service.findByName(searchBean.getSearch());
		model.addAttribute("generos", generos);
		return "admin/generos";
		
		
	}
	
	@GetMapping("/")
	public String showGeneros(@RequestParam(name="idFamilia", required=false)Long idFamilia, Model model) {
		
		List<Genero> generos;
		
		if(idFamilia == null) {
			generos= service.findAll();
		}else {
			generos= service.findAllByFamilia(idFamilia);
		}
		model.addAttribute("generoList",generos);
		return "genero/generos";
	}
	
	@GetMapping("/orderBy/{orderBy}")
	public String verGenerosSorted(@PathVariable String orderBy,Model model) {
		
		List<Genero>generos;
		switch (orderBy) {
		
		case "nombreAsc":
			generos = service.findAllSorted(Direction.ASC,"descripcion");
			break;
		case "nombreDesc":
			generos = service.findAllSorted(Direction.DESC,"descripcion");
			break;
		case "cientificoAsc":
			generos = service.findAllSorted(Direction.ASC,"nombre");
			break;
		case "cientificoDesc":
			generos = service.findAllSorted(Direction.DESC,"nombre");
			break;
		case "familiaAsc":
			generos = service.findAllSorted(Direction.ASC,"familia.nombre");
			break;
		case "familiaDesc":
			generos = service.findAllSorted(Direction.DESC,"familia.nombre");
			break;
		default:
			generos=service.findAll();
		}
		model.addAttribute("generoList", generos);
		return "genero/generos";
		
		
	}
	
	@GetMapping("/newGenero")
	public String nuevoGenero(Model model) {
		
		model.addAttribute("genero", new Genero());		
		model.addAttribute("familias", familiaService.findAllSorted(Direction.ASC,"nombre"));
		
		return "genero/generoForm";
	}

	@PostMapping("/newGenero/submit")
	public String submitNuevoGenero(Genero genero, Model model) {
		service.save(genero);
		return "redirect:/generos/";

	}
	
	
	@GetMapping("/admin/gestGeneros/{orderBy}")
	public String crudGenerosSorted(Model model,@PathVariable String orderBy) {
		List<Genero>generos;
		switch(orderBy) {
		
		case"id":
			generos = service.findAllSorted(Direction.ASC, "id");
			break;
		case "nombre":
			generos = service.findAllSorted(Direction.ASC,"nombre");
			break;
		case "descripcion":
			generos = service.findAllSorted(Direction.ASC,"descripcion");
			break;
		case "familia":
			generos = service.findAllSorted(Direction.ASC,"familia.nombre");
			break;
		case"idDesc":
			generos = service.findAllSorted(Direction.DESC, "id");
			break;
		case "nombreDesc":
			generos = service.findAllSorted(Direction.DESC,"nombre");
			break;
		case "descripcionDesc":
			generos = service.findAllSorted(Direction.DESC,"descripcion");
			break;
		case "familiaDesc":
			generos = service.findAllSorted(Direction.DESC,"familia.nombre");
			break;
		default:
			generos = service.findAll();
		}
		
		model.addAttribute("generos", generos);
		return "admin/generos";
		
		}
		

	@GetMapping("/admin/editarGenero/{id}")
	public String mostrarFormularioEdicionGenero(@PathVariable("id")long id,Model model) {
		Genero generoEdit= service.findById(id);
		
		if(generoEdit != null) {
			model.addAttribute("genero", generoEdit);
			model.addAttribute("familias", familiaService.findAllSorted(Direction.ASC,"nombre") );
			return "genero/generoForm";		
		}else
			return "redirect:/genero/gestGeneros";
	}
	@GetMapping("/admin/borrar/{id}")
	public String borrarGenero(@PathVariable("id")long id) {
		
		service.deleteById(id);
		return "redirect:/generos/admin/gestGeneros/id";
		
	}
	
	
}
