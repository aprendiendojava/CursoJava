package com.wpsnetwork.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Alquiler {
	private Date fechaContrato;
	private Inquilino inqui;
	private Piso piso;
	private double ivaActual;
	
	private static ArrayList listaAlquileres;
	
	public Alquiler() {
		super();
		this.ivaActual = 21;
	}

	public Alquiler(Date fechaContrato, Inquilino inqui, Piso piso, double ivaActual) {
		super();
		this.fechaContrato = fechaContrato;
		this.inqui = inqui;
		this.piso = piso;
		this.ivaActual = ivaActual;
	}

	public double getPrecioAlquiler(){
		return (this.piso.getPrecio() * (this.ivaActual/100)) - this.inqui.getDescuento();
	}
	
	public static ArrayList getListaAlquileres() {
		return listaAlquileres;
	}

	public static void setListaAlquileres(ArrayList listaAlquileres) {
		Alquiler.listaAlquileres = listaAlquileres;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public Inquilino getInqui() {
		return inqui;
	}

	public Piso getPiso() {
		return piso;
	}

	public double getIvaActual() {
		return ivaActual;
	}

}
