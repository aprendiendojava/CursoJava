package com.wpsnetwork.entidades;

public class Circulo extends Figura{
	
	private double radio;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*(radio*radio);
	}

	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}

}
