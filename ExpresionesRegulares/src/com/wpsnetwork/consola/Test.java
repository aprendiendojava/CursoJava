package com.wpsnetwork.consola;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		// String = Inmutable.
		
		// StringBuffer = Implementa a CharSequence y a Appendable. Tiene peor rendimiento. tiene hilos.
		
		// StringBuilder = Implementa a CharSequence y a Appendable. Mejor rendimiento.
		
		// CharBuffer = implementa a Appendable y a Readable
		
		String s = "Hola";
		s.toUpperCase();
		System.out.println(s);	// Es inmutable
		s = s.toUpperCase();
		System.out.println(s);	// Ahora si lo he cambiado, porque he cambiado el destino del vector. Ahora apunta al HOLA en may�sculas. Ya el recolector quitar� el otro
		
		StringBuilder buffer = new StringBuilder();	// Crea un StringBuilder vac�o
		buffer.append("a");		// A�ade
		buffer.append("b");		// A�ade
		buffer.append("c");		// A�ade

		System.out.println("Creado="+buffer);	// Hemos modificado el contenido directamente de la instancia buffer
		System.out.println("Creado="+buffer.toString());	// Hemos modificado el contenido directamente de la instancia buffer
		
		// Eliminar todo el contenido
		buffer.delete(0, buffer.length());
		System.out.println("Eliminado="+buffer);
		System.out.println("Eliminado="+buffer.toString());
		
		for(char i='A';i<='Z';i++){
			buffer.append(i);
		}
		System.out.println("Despu�s de bucle="+buffer);
		System.out.println("Despu�s de bucle="+buffer.toString());
		
		// Buscar d�nde se encuentra una palabra
		String texto = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme ...";
		int pos = 0;
		
		while ((pos = texto.indexOf(" de ", pos)) != -1){		// estoy asignando la posici�n de la cadena " de ", si no la encuentra devuelve -1
			System.out.println("Coincidencia encontrada en pos="+pos);
			pos++;
		}
		
		// Obtener las palabras sueltas
		String[] palabras = texto.split("(\\s+)|(\\p{Punct}+\\s*)");		// Esto separa conforme a esta expresi�n regular. \\s=espacio en blanco
		
		System.out.println(Arrays.toString(palabras));
		
		// Separando por signos de puntuaci�n
		StringTokenizer stringToken = new StringTokenizer(texto, ".,");		// Por defecto el delimitador es espacio, tab y salto de l�nea
		
		while(stringToken.hasMoreTokens()){
			System.out.println(stringToken.nextToken());
		}
		
		// Busca cadenas que cumplen un patr�n
		Pattern patron = Pattern.compile("(\\d{8})(\\p{Alpha})");			// Comprueba DNI
		
		String dnis = " 12345678A    98765432B";
		Matcher coincidencia = patron.matcher(dnis);
		
		// Si algo de la cadena coincide con el patr�n
		if (coincidencia.matches()){
			System.out.println("Coincide");
		}else{

			System.out.println("No coincide");
		}
		
//		 coincidencia.start();
		 
		// Teniendo los patrones, podemos hacer grupos
		while(coincidencia.find()){
			System.out.println(coincidencia.group());		// devuelve la �ltima coincidencia
		}
		// Mira c�mo hacer para que sin ponerle espacio podamos recorrer los dos grupos. (start)
		
		// La clase Scanner
		// Nos permite leer textos y extraer tipos primitivos.
		String csv = "1;Pepito;23;2;Juanito;25";
		Scanner scanner = new Scanner(csv);	// Separa las cosas por unos delimitadores por defecto, que son: espacio y salto de l�nea
		scanner.useDelimiter(";");
		
		while(scanner.hasNext()){
			int id = scanner.nextInt();
			String nombre = scanner.next();
			int edad = scanner.nextInt();

			System.out.println("Id="+id+", Nombre="+nombre+", Edad="+edad);
		}
		
		scanner.close();	// Cierra todos los canales de dentro del scanner. Cuando el scanner est� leyendo de un fichero, se cerrar� el fichero tambi�n.
	}

}
