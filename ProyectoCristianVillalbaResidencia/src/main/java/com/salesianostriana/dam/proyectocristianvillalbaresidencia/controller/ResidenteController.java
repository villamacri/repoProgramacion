package com.salesianostriana.dam.proyectocristianvillalbaresidencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.proyectocristianvillalbaresidencia.servicio.ResidenteServicio;

@Controller
public class ResidenteController {
	
	@Autowired
	public ResidenteServicio residenteServicio;
	//@Autowired
	//public PlanServicio planServicio;
	
	@GetMapping("/gestionResidente")
	public String index(Model model) {
		model.addAttribute("Residentes", residenteServicio.listarTodos());
		return "gestionResidentes";
	}

}
