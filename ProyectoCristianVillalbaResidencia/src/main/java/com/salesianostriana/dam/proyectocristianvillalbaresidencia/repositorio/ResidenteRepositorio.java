package com.salesianostriana.dam.proyectocristianvillalbaresidencia.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.proyectocristianvillalbaresidencia.model.Residente;

public interface ResidenteRepositorio extends JpaRepository<Residente, Long> {

    @Query("SELECT r FROM Residente r ORDER BY r.plan.tipo ASC")
    List<Residente> listarOrdenadosPorPlan();
    
    Optional<Residente> findByDni(String dni);
    
    @Query("SELECT r FROM Residente r ORDER BY r.nombre ASC")
    List<Residente> ordenarPorNombreAsc();

    @Query("SELECT r FROM Residente r ORDER BY r.nombre DESC")
    List<Residente> ordenarPorNombreDesc();

    @Query("SELECT r FROM Residente r ORDER BY r.apellido ASC")
    List<Residente> ordenarPorApellidoAsc();

    @Query("SELECT r FROM Residente r ORDER BY r.apellido DESC")
    List<Residente> ordenarPorApellidoDesc();
    
    @Query("SELECT r FROM Residente r ORDER BY r.fechaNacimiento ASC")
    List<Residente> ordenarPorFechaNacimientoAsc();

    @Query("SELECT r FROM Residente r ORDER BY r.fechaNacimiento DESC")
    List<Residente> ordenarPorFechaNacimientoDesc();
    
}