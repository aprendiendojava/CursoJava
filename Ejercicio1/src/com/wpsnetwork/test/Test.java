package com.wpsnetwork.test;

import com.wpsnetwork.objetos.Baraja;

public class Test {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
		baraja.iniciarJuego();
		baraja.barajar();
		
		System.out.println(baraja.toString());
	}

}
