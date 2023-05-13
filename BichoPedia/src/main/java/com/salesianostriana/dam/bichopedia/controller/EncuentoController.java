package com.salesianostriana.dam.bichopedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.salesianostriana.dam.bichopedia.model.Encuentro;
import com.salesianostriana.dam.bichopedia.model.Especie;
import com.salesianostriana.dam.bichopedia.model.Usuario;
import com.salesianostriana.dam.bichopedia.services.EncuentroService;
import com.salesianostriana.dam.bichopedia.services.EspecieService;
import com.salesianostriana.dam.bichopedia.services.UsuarioService;

@Controller
@RequestMapping("/encuentros/")
public class EncuentoController {
	
	@Autowired
	private EncuentroService service;
	
	@Autowired
	private UsuarioService userService;
	
	@Autowired
	private EspecieService especieService;
	
	@GetMapping("/")
	public String encuentros(Model model) {
		
		model.addAttribute("encuentroList", service.findAll());
		
		return "encuentro/encuentros";
	}
	@Autowired
	private EspecieService espService ;
	
	
	@GetMapping("/newEncuentro")
	public String registro(@AuthenticationPrincipal Usuario u, Model model) {
		List<Especie>especies = espService.findAll();
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
	@GetMapping("/admin/borrar/{id}")
	public String borrarEncuentro(@PathVariable("id")Long id) {
		service.deleteById(id);
		return "redirect:/encuentros/admin/gestEncuentro";
		
	}
	
	
}
