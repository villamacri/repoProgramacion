package com.salesianostriana.dam.proyectocristianvillalbaresidencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.salesianostriana.dam.proyectocristianvillalbaresidencia.servicio.ResidenteServicio;

@Controller
public class InformeController {

    @Autowired
    private ResidenteServicio residenteServicio;

    @GetMapping("/informes")
    public String verInformes(Model model) {
        model.addAttribute("mayores85", residenteServicio.contarResidentesMayores85());
        model.addAttribute("recaudacionAnual", residenteServicio.calcularRecaudacionAnual());
        model.addAttribute("suplemento85", residenteServicio.calcularSuplementoMayores85());
        model.addAttribute("recaudacionConSuplemento", residenteServicio.calcularRecaudacionAnualConSuplemento());
        return "informes";
    }
}

