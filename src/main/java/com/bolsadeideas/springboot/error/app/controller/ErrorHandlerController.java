package com.bolsadeideas.springboot.error.app.controller;


import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.bolsadeideas.springboot.error.app.erros.UsuarioNoEncontradoException;

@ControllerAdvice
public class ErrorHandlerController {
	@ExceptionHandler(ArithmeticException.class)
	public String aritmeticaError(ArithmeticException ex, Model model) {
		model.addAttribute("error", "Error de aritmetica");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestap", new Date());
		return "error/generica";
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public String numberFormatError(NumberFormatException ex, Model model) {
		model.addAttribute("error", "Error de formato");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestap", new Date());
		return "error/generica";
	}
	
	@ExceptionHandler(UsuarioNoEncontradoException.class)
	public String numberFormatError(UsuarioNoEncontradoException ex, Model model) {
		model.addAttribute("error", "Error de UsuarioNoEncontradoException");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestap", new Date());
		return "error/generica";
	}
	
	
}
