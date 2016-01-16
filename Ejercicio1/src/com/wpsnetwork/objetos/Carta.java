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
