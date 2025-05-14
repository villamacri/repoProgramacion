package com.salesianostriana.dam.proyectocristianvillalbaresidencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.salesianostriana.dam.proyectocristianvillalbaresidencia.model.Plan;
import com.salesianostriana.dam.proyectocristianvillalbaresidencia.model.Residente;
import com.salesianostriana.dam.proyectocristianvillalbaresidencia.servicio.PlanServicio;
import com.salesianostriana.dam.proyectocristianvillalbaresidencia.servicio.ResidenteServicio;

@Controller
public class ResidenteController {
	
	@Autowired
	public ResidenteServicio residenteServicio;
	@Autowired
	public PlanServicio planServicio;
	
	@GetMapping("/residentes")
	public String index(Model model) {
		model.addAttribute("residentes", residenteServicio.listarTodos());
		model.addAttribute("residente", new Residente());
		model.addAttribute("planes", planServicio.listarTodos());
		
		return "gestionResidentes";
	}
	
	@PostMapping("/residentes/agregar")
	public String guardar(@ModelAttribute Residente residente, Model model) {
		
		residenteServicio.guardar(residente);
		return "redirect:/residentes";
	}
	
	@PostMapping("/residentes/eliminar/{id}")
	public String eliminar(@PathVariable Long id) {
	    residenteServicio.eliminar(id);
	    return "redirect:/residentes";
	}
	
	@GetMapping("/residentes/editar/{id}")
	public String editar(@PathVariable Long id, Model model) {
		Residente residente = residenteServicio.buscarPorId(id).orElseThrow(()-> new IllegalArgumentException("ID inválido: " + id));
		model.addAttribute("residente", residente);
		model.addAttribute("planes", planServicio.listarTodos());
		
		return "editarResidente";
		
	}
	
	@PostMapping("/residentes/editar/guardar")
	public String guardar(
	        @ModelAttribute Residente residente,
	        @RequestParam("plan") Long planId 
	) {
	    
	    Plan plan = planServicio.buscarPorId(planId).orElse(null);
	    residente.setPlan(plan);

	    residenteServicio.guardar(residente);

	    return "redirect:/residentes";
	}



}
