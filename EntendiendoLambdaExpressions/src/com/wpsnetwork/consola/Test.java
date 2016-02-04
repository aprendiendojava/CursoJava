	
package com.wpsnetwork.consola;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.wpsnetwork.persona.Persona;
 
public class Test {
 
	public static void main(String[] args) {
	 
		ArrayList<Persona> milista= new ArrayList<Persona>();
		milista.add(new Persona("Miguel"));
		milista.add(new Persona("Alicia"));
		
		Collections.sort(milista,new Comparator<Persona>() {
	 
			public int compare(Persona p1,Persona p2) {
			 
				return p1.getNombre().compareTo(p2.getNombre());
			}
		});

		System.out.println("Comparando="+milista.get(0).getNombre().compareTo(milista.get(1).getNombre()));
		System.out.println("Comparando="+milista.get(0).getNombre().compareTo(milista.get(0).getNombre()));
		System.out.println("Comparando="+milista.get(1).getNombre().compareTo(milista.get(0).getNombre()));
	 
		for (Persona p: milista) {
			 
			System.out.println(p.getNombre());
		 
		}
	}
}