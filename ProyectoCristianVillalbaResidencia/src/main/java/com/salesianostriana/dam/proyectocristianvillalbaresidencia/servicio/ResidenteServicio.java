package com.salesianostriana.dam.proyectocristianvillalbaresidencia.servicio;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.dam.proyectocristianvillalbaresidencia.model.Residente;
import com.salesianostriana.dam.proyectocristianvillalbaresidencia.repositorio.ResidenteRepositorio;
import com.salesianostriana.dam.proyectocristianvillalbaresidencia.servicio.base.ServicioBaseImpl;

@Service
public class ResidenteServicio extends ServicioBaseImpl<Residente, Long, ResidenteRepositorio> {

    @Autowired
    private ResidenteRepositorio residenteRepositorio;
    
    private double suplementoMayores85=0.20;

    public Optional<Residente> buscarPorDni(String dni) {
        return residenteRepositorio.findByDni(dni);
    }

    public List<Residente> listarOrdenadosPor(String campo, String direccion) {
        return switch (campo + "_" + direccion.toLowerCase()) {
            case "nombre_asc" -> residenteRepositorio.ordenarPorNombreAsc();
            case "nombre_desc" -> residenteRepositorio.ordenarPorNombreDesc();
            case "apellido_asc" -> residenteRepositorio.ordenarPorApellidoAsc();
            case "apellido_desc" -> residenteRepositorio.ordenarPorApellidoDesc();
            case "fechaNacimiento_asc" -> residenteRepositorio.ordenarPorFechaNacimientoAsc();
            case "fechaNacimiento_desc" -> residenteRepositorio.ordenarPorFechaNacimientoDesc();
            default -> residenteRepositorio.listarOrdenadosPorPlan();
        };
    }
    
    public List<Residente> mayoresDe85() {
        return this.findAll()
                   .stream()
                   .filter(r -> Period.between(r.getFechaNacimiento(), LocalDate.now()).getYears() > 85)
                   .toList();
    }

    
    public double calcularRecaudacionAnual() {
    	return this.findAll()
    			.stream()
    			.mapToDouble(r -> r.getPlan().getPrecio()*12)
    			.sum();
    }
    
    public long contarResidentesMayores85() {
    	return this.findAll()
    			.stream()
    			.filter(r -> Period.between(r.getFechaNacimiento(), LocalDate.now()).getYears() > 85)
    			.count();
    					
    }
    
    public double calcularSuplementoMayores85() {
    	return  this.findAll()
    			.stream()
    			.filter(r -> Period.between(r.getFechaNacimiento(), LocalDate.now()).getYears() > 85)
                .mapToDouble(r -> r.getPlan().getPrecio() * 12 * suplementoMayores85)
                .sum();
    }
    
    public double calcularRecaudacionAnualConSuplemento() {
    	return calcularRecaudacionAnual() + calcularSuplementoMayores85();
    }
    
}
