package com.salesianostriana.dam.ejemplo02;

import org.springframework.stereotype.Service;

@Service
public class DummyService {

	public Producto getProducto() {
		
		return new Producto("Camiseta", "Wena de verdad!", 17.0f, 87, 81.7f);
	}
}
