package com.salesianostriana.dam.bichopedia.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.bichopedia.formbeans.SearchBean;
import com.salesianostriana.dam.bichopedia.model.Encuentro;
import com.salesianostriana.dam.bichopedia.model.Especie;
import com.salesianostriana.dam.bichopedia.model.Usuario;
import com.salesianostriana.dam.bichopedia.model.Valoracion;
import com.salesianostriana.dam.bichopedia.services.EncuentroService;
import com.salesianostriana.dam.bichopedia.services.EspecieService;
import com.salesianostriana.dam.bichopedia.services.UsuarioService;
import com.salesianostriana.dam.bichopedia.services.ValoracionService;



@Controller
@RequestMapping("/encuentros/")
public class EncuentoController {
	
	@Autowired
	private EncuentroService service;
	
	@Autowired
	private UsuarioService userService;
	
	@Autowired
	private EspecieService especieService;
	
	@Autowired
	private ValoracionService valService;
	

	
	@GetMapping("/")
	public String encuentros(Model model) {
		List<Encuentro>encuentros;
		encuentros = service.ordenarEncuentrosPorValoracionMedia(service.findAll());
		Collections.reverse(encuentros);
		model.addAttribute("encuentroList", encuentros);
		model.addAttribute("valoracionList", valService.mediasPorEncuentros(encuentros));
		
		return "encuentro/encuentros";
	}
	
	@GetMapping("/exit")
	public String exit(){
		
	return "redirect:/encuentros/";	
		
	}
	
	@PostMapping("/search")
	public String verEncuentro(@ModelAttribute("searchForm") SearchBean searchBean,Model model){
		
		List<Encuentro>encuentros;
		encuentros =service.findByNombre(searchBean.getSearch());
		model.addAttribute("encuentroList", encuentros);
		model.addAttribute("valoracionList", valService.mediasPorEncuentros(encuentros));
		return "encuentro/encuentros";
		
		
	}
	
	@GetMapping("/details/{id}")
	public String detallesEncuentro(@PathVariable Long id,Model model) {
		
		Encuentro encuentro = service.findById(id);
		
		
		if(encuentro!=null) {
			model.addAttribute("encuentro", encuentro);
			model.addAttribute("valoracion", valService.mediaValoracionPorEncuentro(id));
			model.addAttribute("nuevaValoracion", new Valoracion());
			return "encuentro/encuentroDetails";
		}else
			return "redirect:/encuentros/";
			
		
		
	}
	

	
	@GetMapping("/orderBy/{orderBy}")
	public String encuentrosSorted(@PathVariable String orderBy,Model model) {
		
		List<Encuentro>encuentros;
		
		switch(orderBy) {
		
		case"id":
			encuentros = service.findAllBySorted(Direction.ASC,"id");
			break;
		case "especie":
			encuentros = service.findAllBySorted(Direction.ASC,"especie.descripcion");
			break;
		case "zona":
			encuentros = service.findAllBySorted(Direction.ASC,"zona");
			break;
		case "fecha":
			encuentros = service.findAllBySorted(Direction.ASC,"fecha");
			break;
		case "usuario":
			encuentros = service.findAllBySorted(Direction.ASC,"usuario.username");
			break;
		case "peso":
			encuentros = service.findAllBySorted(Direction.ASC,"peso");
			break;
		case "tamanio":
			encuentros = service.findAllBySorted(Direction.ASC,"tamanio");
			break;
		case"idDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"id");
			break;
		case "especieDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"especie.descripcion");
			break;
		case "zonaDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"zona");
			break;
		case "fechaDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"fecha");
			break;
		case "usuarioDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"usuario.username");
			break;
		case "pesoDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"peso");
			break;
		case "tamanioDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"tamanio");
			break;
		case "cientifico":
			encuentros=service.findAllBySorted(Direction.ASC, "especie.nombre");
			break;
		case "cientificoDesc":
			encuentros=service.findAllBySorted(Direction.DESC, "especie.nombre");
			break;
		case "puntuacionAsc":
			encuentros= service.ordenarEncuentrosPorValoracionMedia(service.findAll());
			break;
		case "puntuacionDesc":
			encuentros= service.ordenarEncuentrosPorValoracionMedia(service.findAll());
			Collections.reverse(encuentros);
			break;
		default:
			encuentros=service.findAll();
		}
		
		model.addAttribute("encuentroList", encuentros);
		model.addAttribute("valoracionList", valService.mediasPorEncuentros(encuentros));
		return "encuentro/encuentros";
		
	}
	
	
	@GetMapping("/newEncuentro")
	public String registro(@AuthenticationPrincipal Usuario u, Model model) {
		List<Especie>especies = especieService.findAll();
		model.addAttribute("usuario", u);
		model.addAttribute("encuentro", new Encuentro());
		model.addAttribute("especies", especies);
		return "encuentro/encuentroForm";
		
	}
	
	@PostMapping("/encuentroSubmit")
	public String registroFinalizado(Encuentro encuentro, @AuthenticationPrincipal Usuario usuario, Model model) {
	    usuario = userService.findById(usuario.getId());
	    encuentro.setUsuario(usuario);
	    userService.save(usuario);
	    service.save(encuentro);
	    return "redirect:/encuentros/";
	}
	
	@PostMapping("/details/submit/{id}")
	public String guardarValoracion(@PathVariable Long id,@AuthenticationPrincipal Usuario u,  
			@ModelAttribute("nuevaValoracion") Valoracion nuevaValoracion, Model model) {
	   
		nuevaValoracion.setEncuentro(service.findById(id));
		nuevaValoracion.setPuntuacionTotal((float) ((nuevaValoracion.getFoto()+nuevaValoracion.getSexo()+nuevaValoracion.getEspecie())/3));
		nuevaValoracion.setUsuario(u);
		nuevaValoracion.getValoracionPK().setEncuentro_id(id);
		nuevaValoracion.getValoracionPK().setValoracion_id(service.findById(id).getValoracionNextVal());
		valService.save(nuevaValoracion);
		
		
		return "redirect:/encuentros/";
	}
	
	@GetMapping("/admin/editarEncuentro/{id}")
	public String editarEncuentro(@PathVariable("id")Long id,Model model) {
		Encuentro encuentroEdit=service.findById(id);
		
		if(encuentroEdit!=null) {
			model.addAttribute("especies", especieService.findAll());
			model.addAttribute("encuentro", encuentroEdit);
			model.addAttribute("usuarios", userService.findAll());
			return "admin/encuentroEdit";
		}else{
			return "redirect:admin/encuentros";
		}
	}

	
	
	
	@PostMapping("/encuentroeditSubmit")
	public String registroEditado(Encuentro encuentro, Model model) {
		service.save(encuentro);
		return "redirect:/encuentros/";
	}
	
	@GetMapping("/admin/gestEncuentro")
	public String crudEncuentros(Model model) {
		
		model.addAttribute("encuentros", service.findAll());
		return "admin/encuentros";
		
	}
	@GetMapping("/admin/gestEncuentro/{orderBy}")
	public String crudEncuentrosSorted(Model model, @PathVariable("orderBy") String orderBy) {
		
		List<Encuentro>encuentros;
		
		switch(orderBy) {
		
		case"id":
			encuentros = service.findAllBySorted(Direction.ASC,"id");
			break;
		case "especie":
			encuentros = service.findAllBySorted(Direction.ASC,"especie.nombre");
			break;
		case "zona":
			encuentros = service.findAllBySorted(Direction.ASC,"zona");
			break;
		case "fecha":
			encuentros = service.findAllBySorted(Direction.ASC,"fecha");
			break;
		case "usuario":
			encuentros = service.findAllBySorted(Direction.ASC,"usuario.username");
			break;
		case "peso":
			encuentros = service.findAllBySorted(Direction.ASC,"peso");
			break;
		case "tamanio":
			encuentros = service.findAllBySorted(Direction.ASC,"tamanio");
			break;
		case"idDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"id");
			break;
		case "especieDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"especie.nombre");
			break;
		case "zonaDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"zona");
			break;
		case "fechaDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"fecha");
			break;
		case "usuarioDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"usuario.username");
			break;
		case "pesoDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"peso");
			break;
		case "tamanioDesc":
			encuentros = service.findAllBySorted(Direction.DESC,"tamanio");
			break;
		default:
			encuentros = service.findAll();
				
		}
		model.addAttribute("encuentros", encuentros);
		return "admin/encuentros";
		
		
		
	}
	
	
	@GetMapping("/admin/borrar/{id}")
	public String borrarEncuentro(@PathVariable("id")Long id) {
		service.deleteById(id);
		return "redirect:/encuentros/admin/gestEncuentro";
		
	}
	
	
}
