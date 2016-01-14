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
		
		//Casting implícito
		Figura[] figuras = new Figura[2];
		figuras[0] = cir1;		// Lo convierte a figura
		figuras[1] = tri1;
//		figuras[0].noSePuedeAcceder();	// No deja acceder desde una figura, aunque sepamos que es cículo
		System.out.println("Círculo, triángulo o figura? "+figuras[0].toString());
		
//		System.out.println("triángulo="+tri1.toString());
		
//		Si quiero volver a ver toda la funcionalidad del cículo tengo que hacer un cast
		cir1 = (Circulo) figuras[0];
//		cir1 = (Circulo) figuras[1];	// Esto fallará

//		(x,y) -> x+y;
//		x -> x+3;
		System.out.println("Operación binaria="+operar((x,y) -> x+y, 2, 3));
		ArrayList<Figura> lista = new ArrayList<>();
		lista.add(cir1);
		lista.add(tri1);

		// Sólo java 8
		lista.stream().allMatch(e -> e.getArea() > 10);	// e es una figura (lo sabe porque lista es una lista de figuras) Devuelve boolean
		lista.stream().filter(e -> e.getArea() > 10);	// e es una figura (lo sabe porque lista es una lista de figuras) Devuelve los que lo cumplan
		lista.parallelStream().filter(e -> e.getArea() > 10);	// e es una figura (lo sabe porque lista es una lista de figuras) Devuelve los que lo cumplan. En paralelo.
	}

	private static int operar(OperacionBinaria op, int a, int b) {
		return op.operacion(a, b);
	}
}
