package com.salesianostriana.dam.ejemplo01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerEjemplo {

	@GetMapping({"/", "welcome"})
	public String welcome(String nombre, Model model) {
		model.addAttribute("nombre", nombre); //Incluimos información en la plantilla
		
		return "index"; //nombre de la plantilla
	}
	
	@GetMapping("/saludo2")
	public String welcome2(Model model) {
		model.addAttribute("persona", new Persona("Cristian", "Villalba"));
		return "Saludo personalizado";
	}
	
}
