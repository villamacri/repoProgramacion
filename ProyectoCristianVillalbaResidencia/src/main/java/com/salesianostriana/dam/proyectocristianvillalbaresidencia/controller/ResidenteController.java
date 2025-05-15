package com.salesianostriana.dam.proyectocristianvillalbaresidencia.controller;

import java.time.LocalDate;
import java.time.Period;
import java.util.Optional;

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
		
		//Validación de dni
		Optional<Residente> existente = residenteServicio.buscarPorDni(residente.getDni());
		
		if(existente.isPresent()) {
			model.addAttribute("errorDni", "Ya existe un residente con ese DNI.");
			model.addAttribute("residentes", residenteServicio.listarTodos());
			model.addAttribute("planes", planServicio.listarTodos());
			return "gestionResidentes";
		
		}
		
		if(residente.getPlan() != null && residente.getPlan().getId() != null) {
			Plan plan = planServicio.buscarPorId(residente.getPlan().getId()).orElse(null);
			residente.setPlan(plan);
		}
		
		//Validación de edad
		if(residente.getFechaNacimiento() != null) {
			int edad = Period.between(residente.getFechaNacimiento(), LocalDate.now()).getYears();
			if(edad < 65) {
				model.addAttribute("errorEdad", "La edad mínima es de 65 años");
				model.addAttribute("residentes", residenteServicio.listarTodos());
				model.addAttribute("planes", planServicio.listarTodos());
				return "gestionResidentes";
			}
		}
		
		
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
	public String guardar(@ModelAttribute Residente residente, @RequestParam("plan") Long planId, Model model ) {
		
		Optional<Residente> existente = residenteServicio.buscarPorDni(residente.getDni());
		
		if(existente.isPresent()) {
			model.addAttribute("errorDni", "Ya existe un residente con ese DNI.");
			model.addAttribute("residentes", residenteServicio.listarTodos());
			model.addAttribute("planes", planServicio.listarTodos());
			return "editarResidente";
		
		}
		
		if(residente.getPlan() != null && residente.getPlan().getId() != null) {
			Plan plan = planServicio.buscarPorId(residente.getPlan().getId()).orElse(null);
			residente.setPlan(plan);
		}
		
	    Plan plan = planServicio.buscarPorId(planId).orElse(null);
	    residente.setPlan(plan);

	    residenteServicio.guardar(residente);

	    return "redirect:/residentes";
	}



}
