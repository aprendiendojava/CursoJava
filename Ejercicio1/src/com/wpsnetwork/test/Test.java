package com.wpsnetwork.test;

import com.wpsnetwork.objetos.Baraja;

public class Test {

	public static void main(String[] args) {
		Baraja baraja = new Baraja();
//		baraja.iniciarJuego();
		baraja.barajar();
		
		System.out.println(baraja.toString());
		
		System.out.println("La primera carta es el "+baraja.reparte().toString());
	}

}
