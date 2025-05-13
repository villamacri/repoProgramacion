package com.salesianostriana.dam.proyectocristianvillalbaresidencia.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectocristianvillalbaresidencia.model.Plan;
import com.salesianostriana.dam.proyectocristianvillalbaresidencia.repositorio.PlanRepositorio;

@Service
public class PlanServicio {

	@Autowired
	private PlanRepositorio planRepositorio;
	
	public List<Plan> listarTodos(){
		return planRepositorio.findAll();
	}
	
	public Optional<Plan> buscarPorId(Long id){
		return planRepositorio.findById(id);
	}
	
	public Plan guardar(Plan plan) {
		return planRepositorio.save(plan);
	}
	
	public void eliminarPorId(Long id) {
		planRepositorio.deleteById(id);
	}
}
