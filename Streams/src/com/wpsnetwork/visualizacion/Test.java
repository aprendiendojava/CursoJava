package com.wpsnetwork.visualizacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

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
	}

}
