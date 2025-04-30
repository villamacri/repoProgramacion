package com.salesianostriana.dam.proyectopepesegura.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.salesianostriana.dam.proyectopepesegura.modelo.Certificado;
import com.salesianostriana.dam.proyectopepesegura.modelo.Curso;
import com.salesianostriana.dam.proyectopepesegura.modelo.Material;
import com.salesianostriana.dam.proyectopepesegura.servicio.CertificadoServicio;
import com.salesianostriana.dam.proyectopepesegura.servicio.CursoServicio;

@Controller
public class CertificadoController {
	@Autowired
	CertificadoServicio certificadoServicio;
	
	@Autowired
	CursoServicio cursoServicio;

	@GetMapping("/admin/Certificado")
	public String listarCertificados(Model model) {
		model.addAttribute("listaCertificado",certificadoServicio.findAll() );
		model.addAttribute("listaCurso", cursoServicio.findAll());
		return "admin/listaCertificado";
	}
	//mostrar formulario para añadir un nuevo certificado
	@GetMapping("/admin/formularioCertificado")
	public String mostrarFormularioCertificado(Model model) {
		model.addAttribute("listaCurso",cursoServicio.findAll());
		model.addAttribute("certificado", new Certificado());
		return "admin/formularioCertificado";
	}
	
	@PostMapping("/admin/nuevoCertificado/submit")
	public String procesarFormularioCertificado(@ModelAttribute("certificado") Certificado c, Model model) {
		Curso crs = c.getCurso();
		if(crs != null && crs.getCertificado()!=null) {
			model.addAttribute("certificado", c);
            model.addAttribute("listaCurso", cursoServicio.findAll());
			model.addAttribute("error", "El curso ya esta asociado.");
			return "admin/formularioCertificado";
		}else {
			certificadoServicio.save(c);
			return "redirect:/admin/Certificado";
		}
		
	}
	@GetMapping("/admin/editarCertificado/{idCertificado}")
	public String mostrarFormularioEdicion(@PathVariable("idCertificado") long id, Model model) {
		Optional<Certificado> certificadoEditar = certificadoServicio.findById(id);
		if(certificadoEditar.isPresent()) {
			model.addAttribute("listaCurso", cursoServicio.findAll());
			model.addAttribute("certificado", certificadoEditar.get());
			return "admin/editarFormularioCertificado";
		}else {
			return "redirect:/admin/Certificado";
		}
	}
	@PostMapping("/admin/editarCertificado/submit")
	public String procesarFormularioEdicionCertificado(@ModelAttribute("certificado") Certificado c, Model model) {
		Curso crs = c.getCurso();
		if(crs != null && crs.getCertificado()!=null) {
			model.addAttribute("certificado", c);
            model.addAttribute("listaCurso", cursoServicio.findAll());
			model.addAttribute("error", "El curso ya esta asociado.");
			return "admin/editarFormularioCertificado";
		}else {
			certificadoServicio.edit(c);
			return "redirect:/admin/Certificado";
		}
		
		
	}
	/**
	 * Método para borrar 
	 * @param id
	 * @return 
	 */
	@GetMapping("/admin/borrarCertificado/{idCertificado}")
	public String borrar(@PathVariable("idCertificado") long id) {
	Optional<Certificado> certificado = certificadoServicio.findById(id);

		if(certificado.isPresent()&& certificado.get().getCurso()!=null){
			
			return "redirect:/admin/Certificado?error=true";
		}else {
		
		certificadoServicio.delete(certificado.get());
		}
		return "redirect:/admin/Certificado";
	}
}
