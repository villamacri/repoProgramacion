package com.salesianostriana.dam.proyectocristianvillalbaresidencia.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.salesianostriana.dam.proyectocristianvillalbaresidencia.model.Plan;
import com.salesianostriana.dam.proyectocristianvillalbaresidencia.servicio.PlanServicio;

@Controller
public class PlanController {

	@Autowired
	private PlanServicio planServicio;
	
	@GetMapping("/planes")
	public String listarPlanes(Model model) {
		model.addAttribute("listaPlanes", planServicio.findAll());
		model.addAttribute("plan", new Plan());
		
		return "gestionPlanes";
	}
	
	@PostMapping("/planes/guardar")
	public String guardarPlan(@ModelAttribute Plan plan) {
		planServicio.save(plan);
		
		return "redirect:/planes";
	}
	
	@GetMapping("/planes/editar/{id}")
	public String editarPlan(@PathVariable Long id, Model model) {
	    Optional<Plan> planOpt = planServicio.findById(id);

	    if (planOpt.isPresent()) {
	        model.addAttribute("plan", planOpt.get());
	        return "editarPlan";
	    } else {
	        return "redirect:/planes";
	    }
	}
	
	@PostMapping("/planes/eliminar/{id}")
	public String eliminarPlan(@PathVariable Long id, RedirectAttributes redirectAttributes) {
	    Optional<Plan> planOpt = planServicio.findById(id);

	    if (planOpt.isPresent()) {
	        Plan plan = planOpt.get();

	        // Verifica si el plan tiene residentes asociados
	        if (plan.getResidentes() != null && !plan.getResidentes().isEmpty()) {
	            redirectAttributes.addFlashAttribute("error", "No se puede eliminar el plan porque tiene residentes asociados.");
	            return "redirect:/planes";
	        }

	        planServicio.delete(plan);
	    }

	    return "redirect:/planes";
	}

	
	@PostMapping("/planes/editar/guardar")
	public String guardarPlanEditado(@ModelAttribute Plan plan) {
	    planServicio.save(plan);
	    return "redirect:/planes";
	}

}
