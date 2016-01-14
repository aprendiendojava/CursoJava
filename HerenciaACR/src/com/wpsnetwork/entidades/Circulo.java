package com.wpsnetwork.entidades;

public class Circulo extends Figura {
	
	private double radio;

	public Circulo(int x, int y, double radio) {
		super(x, y);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double getArea() {
		return Math.PI*(Math.pow(radio, 2));	// elevado a dos
	}
	
	@Override
	public String toString() {
		return "C�rculo [radio="+radio+", Posici�nX()="+getX()+", Posici�nY()="+getY()+"]";
	}

	public void noSePuedeAcceder() {
		
	}
}
