package com.wpsnetwork.interfaces;

public interface Dibujable {
	// Todos los m�todos son impl�citamente p�blicos
	// Las propiedades son public static y final
	
	public static final double PI = 3.14;	// Se puede poner "double PI = 3.14" (es lo mismo)
	
	void dibujar();	// Este obliga a implementar c�digo
	
	// En JDK 8 se ha a�adido el default
	
	default String hola() {	// En cambio este no obliga a implementar c�digo
		// Se puede poner c�digo en m�todos de interfaces
		return "hola";
	}

}
