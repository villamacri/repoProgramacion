package com.salesianostriana.dam.ejemplo02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadoController {

	@GetMapping("/empleado")
	public String showForm(Model model) {
		
		Empleado empleado = new Empleado();
		model.addAttribute("empleadoForm", empleado);
		
		return "form";
	}
	
	@PostMapping ("/addEmpleado")
	public String submit(@ModelAttribute("empleadoForm")Empleado empleado, Model model) {
		//Esto añade al modelo el empleado que se creara al recoger los datos del formulario
		model.addAttribute("empleado", empleado);
		
		return "view";
	}
}
