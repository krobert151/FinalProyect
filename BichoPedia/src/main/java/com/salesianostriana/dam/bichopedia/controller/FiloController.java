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
	
	@PostMapping("/search")
	public String buscarFilo(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		
		List<Filo>filos;
		filos = service.findByNombre(searchBean.getSearch());
		model.addAttribute("filoList", filos);
		return "filo/filos";
		
	}
	@PostMapping("/admin/search")
	public String buscarFiloNombre(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		
		List<Filo>filos;
		filos = service.findByNombre(searchBean.getSearch());
		model.addAttribute("filos", filos);
		return "admin/filos";
		
	}
	
	
	@GetMapping("/")
	public String showFilos (@RequestParam(name="reinoId",required=false)Long reinoId, Model model) {
		
		List<Filo>filos;
		
		if(reinoId==null)
			filos=service.findAll();
		else
			filos=service.FindAllByReinoId(reinoId);
		
		model.addAttribute("filoList", filos);
		return "filo/filos";
		
	} 
	
	@GetMapping("/orderBy/{orderBy}")
	public String verFilosSorted (@PathVariable String orderBy,Model model) {
		
		List<Filo>filos;
		
		switch (orderBy) {
		
		case "nombreAsc":
			filos = service.findAllBySorted(Direction.ASC,"descripcion");
			break;
		case "nombreDesc":
			filos = service.findAllBySorted(Direction.DESC,"descripcion");
			break;
		case "cientificoAsc":
			filos = service.findAllBySorted(Direction.ASC,"nombre");
			break;
		case "cientificoDesc":
			filos = service.findAllBySorted(Direction.DESC,"nombre");
			break;
		case "reinoAsc":
			filos = service.findAllBySorted(Direction.ASC,"reino.nombre");
			break;
		case "reinoDesc":
			filos = service.findAllBySorted(Direction.DESC,"reino.nombre");
			break;
		default:
			filos=service.findAll();		
		}
		
		model.addAttribute("filoList", filos);
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
	
	@GetMapping("/admin/gestFilos/{orderBy}")
	public String crudFilosSorted(Model model,@PathVariable String orderBy) {
		
		List<Filo>filos;
		
		switch(orderBy) {
		
		case "id":
			filos= service.findAllBySorted(Direction.ASC,"id");
			break;
		case "nombre":
			filos = service.findAllBySorted(Direction.ASC,"nombre");
			break;
		case "descripcion":
			filos = service.findAllBySorted(Direction.ASC,"descripcion");
			break;
		case "reino":
			filos = service.findAllBySorted(Direction.ASC,"reino.nombre");
			break;
		case "idDesc":
			filos= service.findAllBySorted(Direction.DESC,"id");
			break;
		case "nombreDesc":
			filos = service.findAllBySorted(Direction.DESC,"nombre");
			break;
		case "descripcionDesc":
			filos = service.findAllBySorted(Direction.DESC,"descripcion");
			break;
		case "reinoDesc":
			filos = service.findAllBySorted(Direction.DESC,"reino.nombre");
			break;
		default:
			filos = service.findAll();	
		
		}
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
