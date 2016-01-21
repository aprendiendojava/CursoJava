package com.wpsnetwork.entidades;

import java.util.Date;

public class Alquiler {
	private Date fechaContrato;
	private Inquilino inqui;
	private Piso piso;
	private double ivaActual;
	
	public double getPrecioAlquiler(){
		return (this.piso.getPrecio() * this.ivaActual) - inqui.getDescuento();
	}
}
