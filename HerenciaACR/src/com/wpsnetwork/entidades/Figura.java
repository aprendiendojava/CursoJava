package com.wpsnetwork.entidades;

public abstract class Figura {
	private int x;
	private int y;
	
	// JavaBean: Propiedades privadas, métodos accesores (getters y setters) y un constructor sin parámetros.

	public Figura() {
		super();				//Constructor del padre sin parámetros
	}
	public Figura(int x, int y){
		this();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public abstract double getArea();
}
