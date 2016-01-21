package com.wpsnetwork.patrones.wrapper.test;

import com.wpsnetwork.patrones.wrapper.ClaseWrapper;

public class Test {

	public static void main(String[] args) {
		ClaseWrapper w = new ClaseWrapper();
		System.out.println(w.getValor());
		
		w.setValor(10);
		
		System.out.println(w.getValor());
	}
	
	//Autoboxing --> int -> Integer;
	//Unboxing --> Integer -> int;
	
	// El comportamiento de estas clases es mas parecido a los tipos primitivos que a las clases
	/*
	// La clase String
	StringBuffer : una clase para trabajar siempre con la misma cadena en memoria (jdk4). Preparada para trabajar con hilos de ejecuci�n.
	StringBuilder : original
	Appendable : 
	CharSequence : 
	Math : operaciones matem�ticas (abs, round)...
	Arrays : m�todos est�ticos, ordenaciones para arrays, desplazar...
	
	 
	 Errores en java
	 ---------------
	 
	 Exception y Error -> Todas implementan la interfaz throuable
	 
	 Exception : checked. Obligados a tratarlas
	 
	 RuntimeException : unchecked. No estamos obligados a tratarlas. Por ejemplo ArrayIndexOutOfBoundException.
	 
	 Error : Errores cr�ticos (falta de memoria...), finalizan la aplicaci�n. Normalmente son impuestas.
	 
	 
	 */

}
