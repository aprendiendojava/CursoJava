package com.wpsnetwork.consola;

import com.wpsnetwork.entidades.Circulo;
import com.wpsnetwork.entidades.Figura;
import com.wpsnetwork.entidades.Triangulo;

public class TestConsola {

	public static void main(String[] args) {
		
		Circulo cir1 = new Circulo(1, 2, 3);
		System.out.println(cir1);
		System.out.println(cir1.getArea());
		
		Triangulo tri1 = new Triangulo(10, 11, 20, 30);
		System.out.println(tri1);
		System.out.println(tri1.getArea());
		
		//Casting implícito
		Figura[] figuras = new Figura[2];
		figuras[0] = cir1;		// Lo convierte a figura
		figuras[1] = tri1;
//		figuras[0].noSePuedeAcceder();	// No deja acceder desde una figura, aunque sepamos que es cículo
		System.out.println("Círculo o figura? "+figuras[0].toString());
		
//		Si quiero volver a ver toda la funcionalidad del cículo tengo que hacer un cast
		cir1 = (Circulo) figuras[0];
//		cir1 = (Circulo) figuras[1];	// Esto fallará
	}

}
