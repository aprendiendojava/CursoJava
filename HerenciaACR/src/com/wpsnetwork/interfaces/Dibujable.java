package com.wpsnetwork.interfaces;

public interface Dibujable {
	// Todos los métodos son implícitamente públicos
	// Las propiedades son public static y final
	
	public static final double PI = 3.14;	// Se puede poner "double PI = 3.14" (es lo mismo)
	
	void dibujar();	// Este obliga a implementar código
	
	// En JDK 8 se ha añadido el default
	
	default String hola() {	// En cambio este no obliga a implementar código
		// Se puede poner código en métodos de interfaces
		return "hola";
	}

}
