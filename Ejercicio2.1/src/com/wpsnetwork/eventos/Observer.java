package com.wpsnetwork.eventos;

import java.util.Date;

public interface Observer {
	void update();
	
	void update (Date fecha, String idCuenta, String nombreCuenta, double cantidad, String tipoMovimiento);

}
