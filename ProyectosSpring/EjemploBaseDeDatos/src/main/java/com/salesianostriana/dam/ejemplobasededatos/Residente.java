package com.salesianostriana.dam.ejemplobasededatos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity
public class Residente {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String nombre;
	private String apellido;
	private int edad;
	private String dni;
	private String nombreFamiliar;
	private PlanSuscripcion plan;

}
