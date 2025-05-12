package com.salesianostriana.dam.proyectocristianvillalbaresidencia.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectocristianvillalbaresidencia.model.Residente;
import com.salesianostriana.dam.proyectocristianvillalbaresidencia.repositorio.ResidenteRepositorio;

@Service
public class ResidenteServicio {

	@Autowired
	private ResidenteRepositorio residenteRepositorio;
	
	public List<Residente> listarTodos() {
	    return residenteRepositorio.listarOrdenadosPorPlan();
	}

	public void guardar(Residente residente) {
		residenteRepositorio.save(residente);
	}
	
	public Optional<Residente> buscarPorId(Long id){
		return residenteRepositorio.findById(id);
	}
	
	public void eliminar(Long id) {
		residenteRepositorio.deleteById(id);
	}
}
