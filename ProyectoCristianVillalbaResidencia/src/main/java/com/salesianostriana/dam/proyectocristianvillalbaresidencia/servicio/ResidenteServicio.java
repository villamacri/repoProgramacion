package com.salesianostriana.dam.proyectocristianvillalbaresidencia.servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectocristianvillalbaresidencia.model.Residente;
import com.salesianostriana.dam.proyectocristianvillalbaresidencia.repositorio.ResidenteRepositorio;
import com.salesianostriana.dam.proyectocristianvillalbaresidencia.servicio.base.ServicioBaseImpl;

@Service
public class ResidenteServicio extends ServicioBaseImpl <Residente, Long, ResidenteRepositorio> {

	@Autowired
	private ResidenteRepositorio residenteRepositorio;
	
	public Optional<Residente> buscarPorDni(String dni){
		return residenteRepositorio.findByDni(dni);
	}
}
