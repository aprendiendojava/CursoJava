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
		return Math.PI*(radio*radio);
	}
	
	@Override
	public String toString() {
		return "Circulo [radio="+radio+", getX()="+getX()+", getY()="+getY()+"]";
	}

}
