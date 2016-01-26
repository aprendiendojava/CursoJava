package com.wpsnetwork.banco;

import java.util.Date;

import com.wpsnetwork.eventos.EmisorEvento;
import com.wpsnetwork.excepciones.CuentaNegativaException;
import com.wpsnetwork.excepciones.NumeroNoValidoException;

public class Cuenta {
	private String id;
	private String nombre;
	private double cantidad;
	
	public Cuenta(String id, String nombre, double cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public void sumaCantidad (double cantidad) throws NumeroNoValidoException, CuentaNegativaException{
		if(cantidad < 0){
			throw new NumeroNoValidoException("La cantidad "+cantidad+" no se puede sumar. Debe ser positiva");
		} else {
			this.cantidad += cantidad;
		}
		LogCuentas log = new LogCuentas();
		log.registraOperacion(new Date(), this.id, this.nombre, cantidad, "suma");
	}
	
	public void restaCantidad (double cantidad) throws NumeroNoValidoException, CuentaNegativaException{
		if(cantidad < 0){
			throw new NumeroNoValidoException("La cantidad "+cantidad+" no se puede restar. Debe ser positiva");
		} else if(this.cantidad - cantidad < 0){
			throw new CuentaNegativaException("Al restar "+cantidad+", se queda la cuenta en negativa.");
		} else{
			this.cantidad -= cantidad;
		}
		
		LogCuentas log = new LogCuentas();
		log.registraOperacion(new Date(), this.id, this.nombre, cantidad, "resta");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public double getCantidad() {
		return cantidad;
	}
	
	
	
}
