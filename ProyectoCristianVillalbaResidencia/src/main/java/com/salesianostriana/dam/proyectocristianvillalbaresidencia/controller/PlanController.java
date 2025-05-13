package com.salesianostriana.dam.proyectocristianvillalbaresidencia.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.proyectocristianvillalbaresidencia.model.Plan;
import com.salesianostriana.dam.proyectocristianvillalbaresidencia.servicio.PlanServicio;

@Controller
public class PlanController {

	@Autowired
	private PlanServicio planServicio;
	
	@GetMapping("/gestionPlanes")
	public String listarPlanes(Model model) {
		model.addAttribute("listaPlanes", planServicio.listarTodos());
		model.addAttribute("plan", new Plan());
		
		return "gestionPlanes";
	}
	
	@PostMapping("/guardar")
	public String guardarPlan(@ModelAttribute("plan") Plan plan) {
		planServicio.guardar(plan);
		
		return "redirect:/planes";
	}
	
	@GetMapping("/editar/{id}")
	public String editarPlan(@PathVariable Long id, Model model) {
		Optional<Plan> planOpt = planServicio.buscarPorId(id);
		
		if(planOpt.isPresent()) {
			/*model.addAttribute("plan", planOpt.get());
			model.addAttribute("listaPlanes", planServicio.listarTodos());*/
			return "index";
		}else {
			return "redirect:/planes";
		}
	}
	
	@PostMapping("/eliminar/{id}")
	public String eliminarPlan(@PathVariable Long id) {
		planServicio.eliminarPorId(id);
		return "redirect:/residentes";
	}
}
