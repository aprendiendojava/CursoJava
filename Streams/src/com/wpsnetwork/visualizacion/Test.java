package com.wpsnetwork.visualizacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import com.wpsnetwork.entidades.Persona;


public class Test {

	public static void main(String[] args) {
		List<String> listaNombres = new ArrayList<>();

		listaNombres.add("Pedro");
		listaNombres.add("Juan");
		listaNombres.add("María");
		listaNombres.add("José");
		listaNombres.add("Marta");
		listaNombres.add("Juan");
		
		// Quiero obtener la lista de nombres sin repetidos que tengan mas de 3 letras
		// El resultado tiene que estar ordenado
		List<String> resultado = new ArrayList<>();
//		for(String n:listaNombres){		//Ponemos en el resultado los mayores de 3 letras. 
//			if((n.length() > 3) && (!resultado.contains(n))){
//				resultado.add(n);
//			}
//		}
//		
//		resultado.sort(new Comparator<String>(){
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//			
//		});
//		
//		for(String n:resultado){		//Ponemos en el resultado los mayores de 3 letras. 
//			System.out.println(n.toString());
//		}
		
		
		////// PROGRAMACIÓN FUNCIONAL ///////
		
		// La otra forma de hacerlo es con stream
		String[] nombres = listaNombres.stream()
					.sorted()						// ordena por el método compare() de la clase
					.distinct()						// elimina repetidos
					.filter(e -> e.length() > 3)	// devuelve un Stream con los que cumplan la condicion
					.toArray(len -> new String[len]);
		
		System.out.println("Con filter="+Arrays.toString(nombres));
		
		// Obtener un array con las longitudes de los nombres
		int[] longitudes = listaNombres.stream()
										.mapToInt(e -> e.length())
										.toArray();

		System.out.println("Con mapToInt="+Arrays.toString(longitudes));
		
		int[] longitudes1 = listaNombres.stream()
										.mapToInt(String::length)
										.toArray();

		System.out.println("Con mapToInt y ::="+Arrays.toString(longitudes1));
		
		List<Persona> personas = new ArrayList<>();
		personas.add(new Persona("Pedro", 49));
		personas.add(new Persona("Pedro1", 48));
		personas.add(new Persona("Juan", 49));
		personas.add(new Persona("Marta", 30));
		personas.add(new Persona("Luis", 30));
		personas.add(new Persona("María", 26));
		
		// Obtener el nombre de la persona mas mayor
//		SELECT nombre FROM personas WHERE edad = (SELECT MAX (edad) FROM personas);
		
		String nombre = personas.stream()
								.max((e1,e2) -> Integer.compare(e1.getEdad(), e2.getEdad()))
								.get()							// Persona
								.getNombre();					// Nombre
		
		System.out.println(nombre);		// Si hay repetidos se queda con el primero.
		
		
		// Obtener los nombres de las personas ordenadas
		String[] n2 = (String[]) personas.stream()
							.map(Persona::getNombre)	// Convierte de Persona a String[]
							.sorted()					// Ordena strings
							.toArray(len -> new String[len]);
		
		System.out.println(Arrays.toString(n2));

		// Queremos la media de las edades
		double media = personas.stream()
								.mapToInt(Persona::getEdad) // convierte de persona a int
								.average()					// hace la media
								.getAsDouble();				// obtiene el valor double
		
		System.out.println("Media: "+media);
		
		// Queremos la suma de las edades
		int suma = personas.stream()
				.mapToInt(Persona::getEdad) // convierte de persona a int
				.sum();						// suma

		System.out.println("Suma: "+suma);
		
//		// 
//		int[] i = personas.stream()
//					.sorted()
//					.map(Persona::getEdad)
//					.toArray();
		
		// El método reduce. Sirve para acumular cosas.
		int sumaEdad = personas.stream()
				.reduce(new Persona("", 0), (acc, e) -> {
					acc.setEdad(acc.getEdad() + e.getEdad());
					return acc;
				}).getEdad();
		
		System.out.println("Suma usando reduce"+sumaEdad);
		
		// Agrupar por edades
		Map<Integer, List<Persona>> mapa = personas.stream().collect(Collectors.groupingBy(Persona::getEdad));
		
		for(int edad: mapa.keySet()){
			System.out.println("Edad="+edad);
			for(Persona p: mapa.get(edad)){
				System.out.println("   Nombre="+p.getNombre());
			}
		}
		
		//Crear dos grupos, uno para personas de edad > 30 y otro para <= 30
		Map<Boolean, List<Persona>> mapa2 = personas.stream()
													.collect(Collectors.partitioningBy(p -> p.getEdad() <= 30));
		
		for(boolean cond: mapa2.keySet()){
			System.out.println("Condición="+cond);
			for(Persona p: mapa2.get(cond)){
				System.out.println("   Nombre="+p.getNombre());
			}
		}
		
		// Obtener todos los nombres en un único String (concatenar)
		String nombresPersonas = personas.stream()
								.map(Persona::getNombre) 	// Transformo objeto persona en un String (Es un getNombre, pero como no tenemos una persona... hacemos map)
								.collect(Collectors.joining("-"));
		
		System.out.println(nombresPersonas);
	}

}
