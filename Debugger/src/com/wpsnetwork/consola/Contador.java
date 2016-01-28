package com.wpsnetwork.consola;

public class Contador {
	private int resultado;

	public int getResultado() {
		return resultado;
	}

	public void contar() {
		for(int i= 0;i<100;i++){
			// Al resultado le voy sumando el valor de i
			resultado+= i;
		}
		
	}
}
