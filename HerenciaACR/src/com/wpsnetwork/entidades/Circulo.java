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
		//pepe
		this.radio = radio;
	}
	
	@Override
	public double getArea() {
		return Math.PI*(Math.pow(radio, 2));	// elevado a dos
	}
	
	@Override
	public String toString() {
		return "Círculo [PosiciónX()="+getX()+", PosiciónY()="+getY()+", radio="+radio+"]";
	}

	public void noSePuedeAcceder() {
		
	}

	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		
	}
}
