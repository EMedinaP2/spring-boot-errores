package com.bolsadeideas.springboot.error.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bolsadeideas.springboot.error.app.models.domain.Usuario;
import com.bolsadeideas.springboot.error.app.services.UsuarioService;


@Controller
public class AppController {
	@Autowired
	private UsuarioService usuarioService;
	
	@SuppressWarnings("unused")
	@GetMapping("/index")
	public String index() {
		//Integer valor = 100/0;
		Integer valor = Integer.parseInt("10xaaaa");
		return "/index";
	}
	
	@GetMapping("/ver/{id}")
	public String ver(@PathVariable Integer id,Model model) {
			Usuario ususario = usuarioService.obtenerPorId(id);
			model.addAttribute("usuario", ususario);
			model.addAttribute("titulo", "Detalle de usuario: ".concat( ususario.getNombre()));
			return "ver";
			
	}
}
