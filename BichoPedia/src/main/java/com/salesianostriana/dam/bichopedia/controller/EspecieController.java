package com.salesianostriana.dam.bichopedia.controller;

import java.util.Collections;
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
	
	@PostMapping("/search")
	public String buscarEspecie(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		
		List<Especie>especies;
		especies = service.findByDesc(searchBean.getSearch());
		model.addAttribute("especieList", especies);
		return "especie/especies";
		
	}
	@PostMapping("/admin/search")
	public String buscarEspecieAdmin(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		
		List<Especie>especies;
		especies = service.findByDesc(searchBean.getSearch());
		model.addAttribute("especies", especies);
		return "admin/especies";
		
	}
	@GetMapping("/")
	public String verEspecies(@RequestParam(name="idGenero",required=false)Long idGenero,Model model) {
		
	    List<Especie> especies; 
	    
	    if (idGenero == null) {
	    	especies = service.findAll();
	    	Collections.shuffle(especies);
	    }else {
	    	especies = service.findAllByGenero(idGenero);
	    }
	    model.addAttribute("especieList", especies);
	    return "especie/especies";
	}
	
	
	@GetMapping("/details/{id}")
	public String detalleEspecie(@PathVariable("id") Long id,Model model) {
		
		Especie especieDetailed = service.findById(id);
		
		if (especieDetailed != null) {
			
			model.addAttribute("especie", especieDetailed);
			return "especie/especieDetails";
			
		}else
			return "redirect:/especies/";
		
		
	}
	
	@GetMapping("/newEspecie")
	public String nuevaEspecie(Model model) {
		
		model.addAttribute("especie", new Especie());
		model.addAttribute("generos", genServcie.findAllSorted(Direction.ASC,"nombre"));
		return "especie/especieForm";
	}

	@PostMapping("/newEspecie/submit")
	public String submitNuevoEspecie(Especie especie, Model model) {

		service.save(especie);
		return "redirect:/especies/";

	}
	
	@GetMapping("/orderBy/{orderBy}")
	public String verEspeciesSorted(@PathVariable String orderBy,Model model) {
		
		List<Especie> especies;
		switch (orderBy) {
		
		case "nombreAsc":
			especies = service.findAllSorted(Direction.ASC,"descripcion");
			break;
		case "nombreDesc":
			especies = service.findAllSorted(Direction.DESC,"descripcion");
			break;
		case "cientificoAsc":
			especies = service.findAllSorted(Direction.ASC,"nombre");
			break;
		case "cientificoDesc":
			especies = service.findAllSorted(Direction.DESC,"nombre");
			break;
		case "generoAsc":
			especies = service.findAllSorted(Direction.ASC,"genero.nombre");
			break;
		case "generoDesc":
			especies = service.findAllSorted(Direction.DESC,"genero.nombre");
			break;
		default:
			especies = service.findAll();
				
		}
		model.addAttribute("especieList", especies);
		return "especie/especies";
		
	}
	
	@GetMapping("/admin/gestEspecies/{orderBy}")
	public String crudEspeciesSorted(Model model, @PathVariable String orderBy) {
	    List<Especie> especies;
	    switch (orderBy) {
	        case "id":
	            especies = service.findAllSorted(Direction.ASC,"id");
	            break;
	        case "idDesc":
	            especies = service.findAllSorted(Direction.DESC,"id");
	        	break;
	        case "nombre":
	            especies = service.findAllSorted(Direction.ASC,"nombre");
	            break;
	        case "descripcion":
	            especies = service.findAllSorted(Direction.ASC,"descripcion");
	            break;
	        case "genero":
	            especies = service.findAllSorted(Direction.ASC,"genero.nombre");
	            break;
	        case "nombreDesc":
	        	especies = service.findAllSorted(Direction.DESC,"nombre");
	        	break;
	        case "descripcionDesc":
	        	especies = service.findAllSorted(Direction.DESC,"descripcion");
	        	break;
	        case "generoDesc":
	        	especies = service.findAllSorted(Direction.DESC,"genero.nombre");
	        	break;
	        default:
	            especies = service.findAll();
	    }
	    model.addAttribute("especies", especies);
	    return "admin/especies";
	}


	@GetMapping("/admin/editarEspecie/{id}")
	public String mostrarFormularioEdicionEspecie(@PathVariable("id") Long id, Model model) {
		Especie especieEdit= service.findById(id);
		
		if(especieEdit != null) {
			model.addAttribute("especie", especieEdit);
			model.addAttribute("generos", genServcie.findAllSorted(Direction.ASC,"nombre"));
			return "especie/especieForm";
		}else
			return "redirect:/especies/gestEspecies";
			
		
	}
	
	@GetMapping("/admin/borrar/{id}")
	public String borrarEspecie(@PathVariable("id")Long id) {
		service.deleteById(id);
		return "redirect:/especies/admin/gestEspecies/id";
		
		
		
	}
	
	
	
}
