package com.salesianostriana.dam.proyectocristianvillalbaresidencia.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.salesianostriana.dam.proyectocristianvillalbaresidencia.model.Residente;

public interface ResidenteRepositorio extends JpaRepository<Residente, Long> {

    @Query("SELECT r FROM Residente")
    List<Residente> listarOrdenadosPorPlan();
}


