package com.wpsnetwork.eventos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmisorEvento {
	private List<Observer> oyentes = new ArrayList<>();
	
	public void addObserver(Observer o){
		oyentes.add(o);
	}
	
	//Manda el evento
	public void update (){
		for (Observer o : oyentes){
			o.update();
		}
	}
	public void update (Date fecha, String idCuenta, String nombreCuenta, double cantidad, String tipoMovimiento){
		for (Observer o : oyentes){
			o.update(fecha, idCuenta, nombreCuenta, cantidad, tipoMovimiento);
		}
	}

//	public void addAlgo() {
//		this.update();
//	}
//	public void eliminar() {
//		this.update("C");
//		
//	}
}
