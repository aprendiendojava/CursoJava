package com.wpsnetwork.consola;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.wpsnetwork.entidades.Cliente;

public class Test {

	// OCA Oracle Certified Associate java SE 8 PROGRAMMER I -- 1Z0-808 -- Editorial Sybex
	
	// OCP Oracle Certified Professional java SE 8 PROGRAMMER II -- 1Z0-809 -- Editorial Sybex
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		// Versión gráfica de java: AWT, SWING.
		
		lista.add("Juan");
		lista.add("Jose");
		
		System.out.println("Tamaño de la lista: "+lista.size());
		
		for(int i=0;i<lista.size();i++){
			System.out.println(lista.get(i));
		}
		
		// Stream, pintamos toda la lista
//		System.out.println(lista.stream());
		
		// A partir de jdk 5
		for(String s:lista){
			System.out.println(s);
		}
		
		// Set: No permiten repetidos
		// La clase Object tiene un método que dice si está repetido o no, el método "equals(): boolean" y el método "hashCode(): int"
		Set<Cliente> clientes = new TreeSet<>();
		clientes.add(new Cliente (3, "ACliente 3", 10));
		clientes.add(new Cliente (1, "CCliente 1", 20));
		clientes.add(new Cliente (2, "BCliente 2", 30));
		clientes.add(new Cliente (1, "ECliente 1", 50));
		
		// Para que pueda ordenar hay que implementar la interfaz Comparable
		// Cuando hemos hecho el compareTo con el atributo codigo, ve que hay uno igual y no mete el segundo con codigo = 1
		
		for(Cliente s:clientes){
			System.out.println(s);
		}

		Cliente c1 = new Cliente (1, "A", 10);
		Cliente c2 = new Cliente (1, "A", 10);
		
		System.out.println(c1==c2); // Compara las posiciones de memoria
		System.out.println("Por el código="+c1.equals(c2)); // Compara por el código
		
		// Si no implementamos a Cloneable, daría un pete
		try {
			Cliente c3 = (Cliente) c1.clone();
			System.out.println("c3="+c3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		// Pasar de un conjunto a una lista
//		Arrays.
		// Se puede hacer de dos formas. La antigua
//		List<Cliente> listaClientes = Collections.list(Collections.enumeration(clientes));
		// La nueva, con un constructor al que puedes pasarle un conjunto.
		List<Cliente> listaClientes = new ArrayList<>(clientes);
		
		Collections.shuffle(listaClientes);		// Desordenamos
		
		System.out.println("Desordenado");
		for(Cliente s:listaClientes){
			System.out.println(s);
		}
		
		listaClientes.sort(new Comparator<Cliente>() {

			@Override
			public int compare(Cliente o1, Cliente o2) {
				return Integer.compare(o1.getCodigo(), o2.getCodigo());
			}
		});
		
		System.out.println("Ordenado");
		for(Cliente s:listaClientes){
			System.out.println(s);
		}
		
		// Un mapa
		Map<Integer, String> diccionario = new HashMap<>();

		diccionario.put(3, "Valor 3");
		diccionario.put(1, "Valor 1");
		diccionario.put(2, "Valor 2");
		
		System.out.println("Mapa, valores");
		for(String s:diccionario.values()){		// Nos devuelve una colección de valores
			System.out.println(s);
		}
		System.out.println("Mapa, claves");
		for(Integer k:diccionario.keySet()){	// Nos devuelve un conjunto de claves
			System.out.println(k);
		}
		
		System.out.println("Elemento con la clave 2: "+diccionario.get(2));
	}

}
