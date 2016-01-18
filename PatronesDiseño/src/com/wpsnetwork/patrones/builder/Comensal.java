package com.wpsnetwork.patrones.builder;

public class Comensal {
	private String[] platos = new String[2];
	
	public void setPlato (int posicion, String plato){
		if (posicion >= 0 && posicion < 2){					// & 	obliga a hacer las dos condiciones
															// && 	primero comprueba la primera, y si ya sabe el resultado, no comprueba la siguiente
			platos[posicion] = plato;
		}
	}
}
