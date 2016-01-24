package com.wpsnetwork.entidades;

public class Piso {
	private int planta;
	private int numPuerta;
	private double precio;
	
	public Piso(int planta, int numPuerta, double precio) {
		super();
		this.planta = planta;
		this.numPuerta = numPuerta;
		this.precio = precio;
	}
	
	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	public int getNumPuerta() {
		return numPuerta;
	}
	public void setNumPuerta(int numPuerta) {
		this.numPuerta = numPuerta;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Piso [planta=" + planta + ", numPuerta=" + numPuerta + ", precio=" + precio + "]";
	}
}
