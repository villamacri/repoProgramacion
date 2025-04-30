package com.salesianostriana.dam.ejemplo02;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  //Esta es la notación que indica que va a ser una tabla, una entidad en la base de datos
@Data @NoArgsConstructor @AllArgsConstructor
public class Empleado {

	@Id
	@GeneratedValue
	private long id;
	private String nombre;
	private String email;
	
}
