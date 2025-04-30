package com.salesianostriana.dam.ejemplobasededatos;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@Entity
public class PlanSuscripcion {

	@Id
	@GeneratedValue
	private long id;
	
	private String tipo;
	private List<Residente> listadoResidentes;
	private String servicios;
}
