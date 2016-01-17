package com.wpsnetwork.objetos;

import com.wpsnetwork.enumerados.PaloCarta;

public class Carta {
	
	private int num;
	private PaloCarta paloCarta;
	private double puntuacion;
	
	public Carta(int num, PaloCarta paloCarta) {
		super();
		this.num = num;
		this.paloCarta = paloCarta;
		puntuacion = 0;
	}

	@Override
	public String toString() {
		String cadena = new String();
		switch(this.num){
			case 1:
				cadena = "as";
				break;
			case 8:
				cadena = "sota";
				break;
			case 9:
				cadena = "caballo";
				break;
			case 10:
				cadena = "rey";
				break;
			default:
				cadena = Integer.toString(this.getNum());
		}
		return  cadena + " de " + this.getPaloCarta().toString();
	}

	public int getNum() {
		return num;
	}

	public PaloCarta getPaloCarta() {
		return paloCarta;
	}

	public double getPuntuacion() {
		return puntuacion;
	}
}
