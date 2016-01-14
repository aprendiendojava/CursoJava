package com.wpsnetwork.entidades;

public abstract class Figura {
	private int x;
	private int y;
	
	// JavaBean: Propiedades privadas, m�todos accesores (getters y setters) y un constructor sin par�metros.

	public Figura() {
		super();				//Constructor del padre sin par�metros
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