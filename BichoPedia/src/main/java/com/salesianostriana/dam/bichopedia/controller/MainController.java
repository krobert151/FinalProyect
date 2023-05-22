package com.salesianostriana.dam.bichopedia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.bichopedia.model.Encuentro;
import com.salesianostriana.dam.bichopedia.model.Usuario;
import com.salesianostriana.dam.bichopedia.services.EncuentroService;

@Controller
public class MainController {

	
	@Autowired
	private EncuentroService encuentroService;
	
	
	@GetMapping("/")
	private String index(@AuthenticationPrincipal Usuario usuario, Model model) {
		
		model.addAttribute("usuario", usuario);
		return "index";
		
	}
	@GetMapping("/myProfile")
	private String viewMyProfile(@AuthenticationPrincipal Usuario usuario,Model model) {
		
		List<Encuentro>encuentros;
		encuentros = encuentroService.findAllByUser(usuario.getId());
		
		model.addAttribute("encuentros", encuentros);
		model.addAttribute("usuario", usuario);
		
		
		return "myProfile";
	}
	
	@GetMapping("/aboutUs")
	private String aboutUs() {
		
		return "aboutUs";
		
	}
}
