package com.wpsnetwork.consola;

import java.util.ArrayList;

import com.wpsnetwork.entidades.Circulo;
import com.wpsnetwork.entidades.Figura;
import com.wpsnetwork.entidades.Triangulo;
import com.wpsnetwork.entidades.enumerados.TipoTriangulo;
import com.wpsnetwork.interfaces.OperacionBinaria;

public class TestConsola {

	public static void main(String[] args) {
		
		Circulo cir1 = new Circulo(1, 2, 3);
		System.out.println(cir1);
		System.out.println(cir1.getArea());
		
		Triangulo tri1 = new Triangulo(10, 11, 20, 30, TipoTriangulo.EQUILATER);
		System.out.println(tri1);
		System.out.println(tri1.getArea());
		
		//Casting impl�cito
		Figura[] figuras = new Figura[2];
		figuras[0] = cir1;		// Lo convierte a figura
		figuras[1] = tri1;
//		figuras[0].noSePuedeAcceder();	// No deja acceder desde una figura, aunque sepamos que es c�culo
		System.out.println("C�rculo, tri�ngulo o figura? "+figuras[0].toString());
		
//		System.out.println("tri�ngulo="+tri1.toString());
		
//		Si quiero volver a ver toda la funcionalidad del c�culo tengo que hacer un cast
		cir1 = (Circulo) figuras[0];
//		cir1 = (Circulo) figuras[1];	// Esto fallar�

//		(x,y) -> x+y;
//		x -> x+3;
		System.out.println("Operaci�n binaria="+operar((x,y) -> x+y, 2, 3));
		ArrayList<Figura> lista = new ArrayList<>();
		lista.add(cir1);
		lista.add(tri1);

		// S�lo java 8
		lista.stream().allMatch(e -> e.getArea() > 10);	// e es una figura (lo sabe porque lista es una lista de figuras) Devuelve boolean
		lista.stream().filter(e -> e.getArea() > 10);	// e es una figura (lo sabe porque lista es una lista de figuras) Devuelve los que lo cumplan
		// La siguiente l�nea no devuelve nada, porque hace un println de todo lo anterior
//		lista.parallelStream().filter(e -> e.getArea() > 40).forEach(f -> System.out.println(f));	// e es una figura (lo sabe porque lista es una lista de figuras) Devuelve los que lo cumplan. En paralelo.
		// Al estar en paralelo puede pintar antes el c�rulo o el tri�ngulo, indiferentemente.  
		lista.stream().map(e -> e.getArea() > 40).forEach(f -> System.out.println(f));	// e es una figura (lo sabe porque lista es una lista de figuras) Devuelve los que lo cumplan. En paralelo.
	}

	private static int operar(OperacionBinaria op, int a, int b) {
		return op.operacion(a, b);
	}
}
