package com.wpsnetwork.consola;

import com.wpsnetwork.entidades.Coche;

public class Main {				// CamelCase (nomenclatura en java)
	
	public static void main(String[] args){		// método público (se accede desde cualquier parte de la apli)
												// main(String[] args) --> firma
												// void --> tipo retorno
												// public static --> modificadores
		System.out.println ("Hola mundo!");
		
		// Tipos de datos:
		// ===============
		
//		
//		 Numéricos
//		 		byte 	=> (-128, 127) 					=> 2^8
//		 		short 	=> (-32768, 32767) 				=> 2^16
//		 		int 	=> (-4000000000, 3999999999) 	=> 2^32
//		 		long 	=> 								=> 2^64
//		
//		
//		
//		 Reales: Números decimales, más precisos.
//		 		float	=> 
//		 		double	=>
//		
//		Carácter:
//				char	=> Un único carácter
//		
//		Booleano:
//			cierto		=> true
//			falso		=> false
		
//		Propiedades			=> Se definen fuera de los métodos, son globales a nivel de clase.
//		Variables locales	=> Se definen y existen dentro de los métodos. Tienen preferencia sobre las de la clase.
//								
		
		int numeroRuedas = 128;				// Obligatorio inicializarlas
		long numeroLong = 100L;
		int numeroLargo = 2_000_000;		// A partir de la versión 7 se pueden usar "_" como separador de miles
		
		byte valorByte;
		valorByte = (byte) numeroRuedas;	// Casting (moldeo)

		float piFloat = 3.14f;
		double pi = 3.14;
		
//		La clase String
//		================
//			Una cadena de caracteres sin tamaño
//			Es inmutable
		
		String cadena = "Esto es una cadena de caracteres.";
		cadena = cadena.toUpperCase();
		cadena = cadena.concat(" Esto viene concatenado.");
		
		System.out.println(cadena.toString());
//		
//		Sentencias de control
//		
//			Condicionales:
//				If 
//					if (condición){
//						Si la condición es cierta
//					} else {
//						En caso de falso
//					}
//		
//				Switch
//					switch(valor){
//						case valor1:
//
//						case valor2:
//		
//						default:
//		
//		
//				
//				If Terciario
//					condición?instrucción si cierto;instrucción si falso;
//		
//		
		System.out.println("-if");
		boolean condicion = false;
		if (condicion) System.out.println("Es cierta la condición");
		else if (2==3) System.out.println("Es falso");
		else if (2==2) System.out.println("Dos es igual a dos");
		
		System.out.println("-switch");
		int valor = 2;
		switch(valor){
		case 1:
			System.out.println("Es uno");
			break;
		case 2:
		case 3:
			System.out.println("Es dos o tres");
			break;
		default:
			System.out.println("No es ni uno ni dos ni tres");
		}
		
		System.out.println("-if terciario");
		boolean resultado = (2==3)?true:false;
		
//		Iterativas
//		==========
//		
//			While
//				while(condición){
//						conjunto de instrucciones para ejecutar mientras la condición sea cierta.
//				}
//		
//			continue: se escribe dentro de un while o un for y se usa para omitir las líneas siguientes a él
//					y seguir con la condición del bucle
//		
//			FOR:
//				for(inicialización;condición;incremento){
//					código a ejecutar
//				}
//		
//			DO...WHILE
//				do{		
//					instrucciones a ejecutar
//				} while(condición);
//		
//		
//		
//		
		System.out.println("-bucles");
		int i = 0;
		while (i < 5){
			System.out.println(i++);
		}
		
		for(int j=0;j<5;j++){
			System.out.println(j);
		}
		
		int opcion = 0;
		do{
			System.out.println("Opción 1");
			System.out.println("Opción 2");
			// Lectura teclado
			opcion = 1;
		}while(opcion != 1 && opcion != 2);
		
		/*
		 * Arrays
		 * ======
		 * 
		 * 	int[] array1D = new int[5];
		 * 	int[][] array2D = new int [2][3];
		 * 
		 * 
		 */
		
		int[] array1D = new int[5];
		int[][] array2D = { {1,2}, {3,4,7,8}, {5,6} };
		
		// array de arrays de diferentes dimensiones
		int[][] array = new int[3][2];
		array[0] = new int [2];
		array[1] = new int [4];
		array[2] = new int [2];
		
		for(int k=0;k < array.length;k++){
			for(int h=0;h < array[k].length;h++){
				System.out.println("Array="+array[k][h]);
			}
		}
		
		for(int[] a : array){
			for(int b : a){
				System.out.println("ArrayConForOptimizado="+b);
			}
		}
		
		// Declaraciones con objetos
		Coche c1 = new Coche(); // Objeto coche
		System.out.println("Num. Coches="+c1.getNumCoches());
		Coche c2 = new Coche("1111BBB", "Peugeot", "307", 5);
		
		c1.setMarca("Peugeot");
		// como ya tiene creado el toString(), lo llama automáticamente.
		System.out.println(c2); // que es lo mismo que --> System.out.println(c2.toString()); 
		System.out.println("Num. Coches="+c2.getNumCoches()); 
		System.out.println("Num. Coches="+Coche.getNumCoches()); // Se puede llamar sin instanciar
	}
}
