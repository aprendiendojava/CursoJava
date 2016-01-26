package com.wpsnetwork.eventos;

import java.util.Date;

public class ReceptorEvento implements Observer {

	@Override
	public void update() {
		System.out.println("Evento sin parámetros recibido");

	}

	@Override
	public void update(Date fecha, String idCuenta, String nombreCuenta, double cantidad, String tipoMovimiento) {
		System.out.println("Fecha="+fecha);
		System.out.println("Cuenta="+idCuenta);
		System.out.println("Titular="+nombreCuenta);
		System.out.println("Cantidad="+cantidad);
		System.out.println("Movimiento="+tipoMovimiento);
	}

}