package com.salesianostriana.dam.proyectocristianvillalbaresidencia.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Plan {
	@Id
	@GeneratedValue
	private long id;
	
	private String tipo;
	private String [] servicios;
	
	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(mappedBy="plan", fetch = FetchType.EAGER)
	private List <Residente> residentes = new ArrayList<>();
}
