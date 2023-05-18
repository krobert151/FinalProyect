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
	
	@PostMapping("/search")
	public String buscarClases(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		
		List<Clase>clases;
		clases = service.findByNombre(searchBean.getSearch());
		model.addAttribute("claseList", clases);
		return "clase/clases";
		
	}
	@PostMapping("/admin/search")
	public String buscarClasesAdmin(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		
		List<Clase>clases;
		clases = service.findByNombre(searchBean.getSearch());
		model.addAttribute("clases", clases);
		return "admin/clases";
		
	}
	
	@GetMapping("/")
	public String showCalses(@RequestParam(name="filoId",required=false)Long filoId,  Model model) {
		
		List<Clase>clases;
		
		if(filoId==null) 
			clases= service.findAll();
		else
			clases=service.findAllByFiloId(filoId);
			
			
		model.addAttribute("claseList",clases);
		
		return "clase/clases";
		
	}
	@GetMapping("/orderBy/{orderBy}")
	public String verClasesSorted(@PathVariable String orderBy,Model model) {
		
		List<Clase>clases;
		
		switch (orderBy) {
		
		case "nombreAsc":
			clases = service.findAllSorted(Direction.ASC,"descripcion");
			break;
		case "nombreDesc":
			clases = service.findAllSorted(Direction.DESC,"descripcion");
			break;
		case "cientificoAsc":
			clases = service.findAllSorted(Direction.ASC,"nombre");
			break;
		case "cientificoDesc":
			clases = service.findAllSorted(Direction.DESC,"nombre");
			break;
		case "filoAsc":
			clases = service.findAllSorted(Direction.ASC,"filo.nombre");
			break;
		case "filoDesc":
			clases = service.findAllSorted(Direction.DESC,"filo.nombre");
			break;
		default:
			clases=service.findAll();		
		}
		
		model.addAttribute("claseList", clases);
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
	
	@GetMapping("/admin/gestClases/{orderBy}")
	public String crudClaseSorted(Model model, @PathVariable String orderBy) {
		
		List<Clase>clases;
		
		switch(orderBy) {
		
		case"id":
			clases = service.findAllSorted(Direction.ASC,"id");
			break;
		case "nombre":
			clases = service.findAllSorted(Direction.ASC,"nombre");
			break;
		case "descripcion":
			clases = service.findAllSorted(Direction.ASC,"descripcion");
			break;
		case "filo":
			clases = service.findAllSorted(Direction.ASC,"filo.nombre");
			break;
		case"idDesc":
			clases = service.findAllSorted(Direction.DESC,"id");
			break;
		case "nombreDesc":
			clases = service.findAllSorted(Direction.DESC,"nombre");
			break;
		case "descripcionDesc":
			clases = service.findAllSorted(Direction.DESC,"descripcion");
			break;
		case "filoDesc":
			clases = service.findAllSorted(Direction.DESC,"filo.nombre");
			break;
		default:
			clases=service.findAll();	
		
		}
		model.addAttribute("clases", clases);
		return "admin/clases";
		
		
	} 

	@GetMapping("/admin/editarClase/{id}")
	public String mostrarFormularioEdicionClases(@PathVariable("id")long id,Model model) {
			Clase claseEdit = service.findById(id);
			
			if(claseEdit != null) {
				
				model.addAttribute("clase", claseEdit);
				model.addAttribute("filos", filoService.findAllBySorted(Direction.ASC,"nombre"));
				return "clase/claseForm";
				
			}else
				return "redirect:/clases/gestClases";
	}
	
	@GetMapping("/admin/borrar/{id}")
	public String borrarClase(@PathVariable("id")long id) {
		service.deleteById(id);
		return "redirect:/clases/admin/gestClases/id";
		
	}
	
	
}
