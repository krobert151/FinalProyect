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

import com.salesianostriana.dam.bichopedia.formbeans.SearchBean;
import com.salesianostriana.dam.bichopedia.model.Usuario;
import com.salesianostriana.dam.bichopedia.services.UsuarioService;

@Controller
@RequestMapping("/admin/")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/")
	public String listarUsuarios(Model model) {
		
		model.addAttribute("userList", usuarioService.findAll());
		return "/admin/usuarios";
		
	}
	
	@PostMapping("/search")
	public String buscarUsuariosAdmin(@ModelAttribute("searchForm")SearchBean searchBean,Model model) {
		List<Usuario>usuarios;
		usuarios = usuarioService.findByUsername(searchBean.getSearch());
		model.addAttribute("userList", usuarios);	
		return "admin/usuarios";
	}
	
	
	@GetMapping("/orderBy/{orderBy}")
	public String listarUsuariosSorted (@PathVariable String orderBy,Model model) {
		
		List<Usuario>usuarios;
		
		switch(orderBy) {
		
		case "idAsc":
			usuarios = usuarioService.findAllSorted(Direction.ASC, "id");
			break;
		case "idDesc":
			usuarios = usuarioService.findAllSorted(Direction.DESC, "id");
			break;
		case "nombreAsc":
			usuarios = usuarioService.findAllSorted(Direction.ASC, "nombre");
			break;
		case "nombreDesc":
			usuarios = usuarioService.findAllSorted(Direction.DESC, "nombre");
			break;
		case "apellidosAsc":
			usuarios = usuarioService.findAllSorted(Direction.ASC, "apellidos");
			break;
		case "apellidosDesc":
			usuarios = usuarioService.findAllSorted(Direction.DESC, "apellidos");
			break;		
		case "correoAsc":
			usuarios = usuarioService.findAllSorted(Direction.ASC, "correo");
			break;
		case "correoDesc":
			usuarios = usuarioService.findAllSorted(Direction.DESC, "correo");
			break;
		case "usernameAsc":
			usuarios = usuarioService.findAllSorted(Direction.ASC, "username");
			break;
		case "usernameDesc":
			usuarios = usuarioService.findAllSorted(Direction.DESC, "username");
			break;
		case "fechanacAsc":
			usuarios = usuarioService.findAllSorted(Direction.ASC, "fechaNac");
			break;
		case "fechanacDesc":
			usuarios = usuarioService.findAllSorted(Direction.DESC, "fechaNac");
			break;
		default:
			usuarios = usuarioService.findAll();
		}
		
		
		model.addAttribute("userList", usuarios);
		return "/admin/usuarios";
		
	}
	
	
	@GetMapping("newUser")
	public String nuevoUsuario(Model model) {
		
		model.addAttribute("usuario",new Usuario());
		
		return "formularioUsuario";
		
	}
	
	@PostMapping("/newUser/submit")
	public String procesarUsuario(@ModelAttribute("usuario")Usuario usuario) {
	    usuarioService.save(usuario);    
	    return "redirect:/users/";
	}
	
	
	@GetMapping("/editarUsuario/{id}")
	public String mostrarFormularioEdicion(@PathVariable("id") long id, Model model) {
		
		Optional<Usuario> userEdit = usuarioService.findById(id);
		
		if(userEdit.isPresent()) {
			model.addAttribute("usuario", userEdit.get());
			return "/admin/formularioUsuario";
			
		}else {
			return "redirect:/users/";
		}
		
	}
	@PostMapping("/usuarios/editar")
	public String editarUsuario(@ModelAttribute("usuario") Usuario usuario) {
	    
		usuarioService.edit(usuario);
		
		return "redirect:/users/";
		
	}
	
	@GetMapping("/borrar/{id}")
	public String borrarUsuario(@PathVariable("id")long id) {
		usuarioService.deleteById(id);
		return "redirect:/admin/";		

		
	}
	
	
}
