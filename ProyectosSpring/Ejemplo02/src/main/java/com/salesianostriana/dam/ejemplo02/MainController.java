package com.salesianostriana.dam.ejemplo02;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//Esta clase va a utilizar un servicio que nos va a proveer de algunos
@Controller
public class MainController {

	@Autowired
	private DummyService service;
	
	@GetMapping
	public String welcome(@RequestParam(name="nombre", required=false, defaultValue="Mundo") String nombre, Model model) {
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("today", LocalDate.now());
		model.addAttribute("producto", service.getProducto());
		
		return "index";
	}
}