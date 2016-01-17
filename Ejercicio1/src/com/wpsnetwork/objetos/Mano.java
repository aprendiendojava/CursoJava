package com.wpsnetwork.objetos;

public class Mano {
	private int numCartas;
	Carta[] cartas;
	
	public void repartir (Carta[] cartas) {
		
		int cont = 0;
		
		for(Carta a : cartas){
			cont++;
			this.cartas[cont] = a;
		}
		
	}
	
	public int getNumCartas() {
		return numCartas;
	}
	
	public double puntuacion () {
		
		double suma = 0;
		
		for(Carta a : cartas){
			suma = suma + a.getPuntuacion();
		}
		
		return suma;
		
	}

	@Override
	public String toString() {
		
		String cadena = new String();
		
		int cont = 0;
		for(Carta a : cartas){
			switch (cont){
				case 0:
					cadena = a.toString();
				default:
					cadena = cadena.concat(", " + a.toString()); 
			}
			cont++;
		}
		
		return cadena;
	}
	
	
}