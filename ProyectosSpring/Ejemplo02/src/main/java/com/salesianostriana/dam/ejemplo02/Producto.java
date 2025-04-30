package com.salesianostriana.dam.ejemplo02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Producto {
	private String nombre;
	private String descripcion;
	private float  precio;
	private int numeroVotos;
	private float porcentajeSatisfacción;
}