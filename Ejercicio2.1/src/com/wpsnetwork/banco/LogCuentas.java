package com.wpsnetwork.banco;

import java.util.Date;

import com.wpsnetwork.eventos.EmisorEvento;
//import com.wpsnetwork.eventos.ReceptorEvento;
import com.wpsnetwork.eventos.ReceptorEvento;

public class LogCuentas {
	
	private static LogCuentas instance = new LogCuentas();		// siempre devuelve la misma instancia

	public LogCuentas() {
		super();
	}
	
	public static LogCuentas getInstance(){
		return instance;
	}
	
	public void registraOperacion(Date fecha, String idCuenta, String nombreCuenta, double cantidad, String tipoMovimiento){
		EmisorEvento emisor = new EmisorEvento();
		ReceptorEvento oyente = new ReceptorEvento();
		emisor.addObserver(oyente);
		emisor.update(fecha, idCuenta, nombreCuenta, cantidad, tipoMovimiento);
//		Si ha habido error se muestra esto
//		System.out.println("Fecha="+this.fecha);
	}
	
}
