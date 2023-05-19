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
	
	@PostMapping("/search")
	public String buscarOrden(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		
		List<Orden>ordenes;
		ordenes=service.findByName(searchBean.getSearch());
		model.addAttribute("ordenList", ordenes);
		return "orden/ordenes";
	}
	@PostMapping("/admin/search")
	public String buscarOrdenAdmin(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		
		List<Orden>ordenes;
		ordenes=service.findByName(searchBean.getSearch());
		model.addAttribute("ordenes", ordenes);
		return "admin/ordenes";
	}
	
	@GetMapping("/")
	public String showOrdenes(@RequestParam(name="claseId", required=false)Long claseId, Model model) {
		
		List<Orden>ordenes;
		
		if(claseId==null) {
			
			ordenes= service.findAll();
			
		}else {
			ordenes=service.findAllByClaseId(claseId);
		}		
		
		model.addAttribute("ordenList", ordenes);
		
		return "orden/ordenes";
	}
	
	@GetMapping("/orderBy/{orderBy}")
	public String verOrdenesSorted(@PathVariable String orderBy,Model model) {
		
		List<Orden>ordenes;
		switch (orderBy) {
		
		case "nombreAsc":
			ordenes = service.findAllBySorted(Direction.ASC,"descripcion");
			break;
		case "nombreDesc":
			ordenes = service.findAllBySorted(Direction.DESC,"descripcion");
			break;
		case "cientificoAsc":
			ordenes = service.findAllBySorted(Direction.ASC,"nombre");
			break;
		case "cientificoDesc":
			ordenes = service.findAllBySorted(Direction.DESC,"nombre");
			break;
		case "claseAsc":
			ordenes = service.findAllBySorted(Direction.ASC,"clase.nombre");
			break;
		case "claseDesc":
			ordenes = service.findAllBySorted(Direction.DESC,"clase.nombre");
			break;
		default:
			ordenes=service.findAll();		
		}
		model.addAttribute("ordenList", ordenes);
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
	
	@GetMapping("/admin/gestOrdenes/{orderBy}")
	public String curdOrdenesSorted(Model model,@PathVariable String orderBy) {
		
		List<Orden>ordenes;
		
		switch(orderBy) {
		
		case "id":
			ordenes = service.findAllBySorted(Direction.ASC,"id");
			break;
		case "nombre":
			ordenes = service.findAllBySorted(Direction.ASC,"nombre");
			break;
		case "descripcion":
			ordenes = service.findAllBySorted(Direction.ASC,"descripcion");
			break;
		case "clase":
			ordenes = service.findAllBySorted(Direction.ASC,"clase.nombre");
			break;
		case "idDesc":
			ordenes = service.findAllBySorted(Direction.DESC,"id");
			break;
		case "nombreDesc":
			ordenes = service.findAllBySorted(Direction.DESC,"nombre");
			break;
		case "descripcionDesc":
			ordenes = service.findAllBySorted(Direction.DESC,"descripcion");
			break;
		case "claseDesc":
			ordenes = service.findAllBySorted(Direction.DESC,"clase.nombre");
			break;
		default:
			ordenes = service.findAll();
		
		}
		model.addAttribute("ordenes", ordenes);
		return "admin/ordenes";
		
		
	}
	
	@GetMapping("/admin/editarOrden/{id}")
	public String mostrarFormularioEdicionOrdenes(@PathVariable("id")long id, Model model) {
		Orden ordenEdit = service.findById(id);
		
		if(ordenEdit != null) {
			
			model.addAttribute("orden", ordenEdit);
			model.addAttribute("clases", claseService.findAllSorted(Direction.ASC,"nombre"));
			return "orden/ordenForm";
			
		}else
			return "redirect:/ordenes/gestOrdenes";
		
	}
	@GetMapping("/admin/borrar/{id}")
	public String borrarOrden(@PathVariable("id")long id) {
		service.deleteById(id);
		return "redirect:/ordenes/admin/gestOrdenes/id";
	}
	
	
}
