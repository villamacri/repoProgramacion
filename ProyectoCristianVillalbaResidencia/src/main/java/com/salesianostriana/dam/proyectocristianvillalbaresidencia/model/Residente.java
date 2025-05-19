package com.salesianostriana.dam.proyectocristianvillalbaresidencia.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Residente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nombre, apellido;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechaNacimiento;
	
	private String dni;
	private String nombreFamiliar;
	
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="fk_residente_plan"))
	private Plan plan;
	
	/*
     * MÉTODOS HELPER PARA LA ASOCIACIÓN CON PLAN
     */
    
    public void addToPlan(Plan plan) {
        this.plan = plan;
        plan.getResidentes().add(this);
    }
    
    public void removeFromPlan(Plan plan) {
        plan.getResidentes().remove(this);
        this.plan = null;        
    }
}
