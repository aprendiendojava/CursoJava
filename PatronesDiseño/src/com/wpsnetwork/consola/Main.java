package com.wpsnetwork.consola;

import com.wpsnetwork.patrones.abstractfactory.ColorFactory;
import com.wpsnetwork.patrones.abstractfactory.FactoryProducer;
import com.wpsnetwork.patrones.abstractfactory.FormaFactory;
import com.wpsnetwork.patrones.abstractfactory.interfaces.Forma;
import com.wpsnetwork.patrones.builder.Comensal;
import com.wpsnetwork.patrones.builder.ComensalBuilder;
import com.wpsnetwork.patrones.factory.Paciente;
import com.wpsnetwork.patrones.factory.PacienteFactory;
import com.wpsnetwork.patrones.iterator.Cliente;
import com.wpsnetwork.patrones.iterator.ColeccionArray;
import com.wpsnetwork.patrones.iterator.interfaces.Iterator;
import com.wpsnetwork.patrones.observer.EmisorEvento;
import com.wpsnetwork.patrones.observer.ReceptorEvento;
import com.wpsnetwork.patrones.singleton.ClienteSingleton;

public class Main {

	public static void main(String[] args) {
		//Patrón factory
		Paciente p1 = PacienteFactory.getPaciente("HOMBRE");
		Paciente p2 = PacienteFactory.getPaciente("MUJER");
		
		//Abstract factory
		FormaFactory fabrica1 = (FormaFactory)FactoryProducer.getFactory("FORMA");
		ColorFactory fabrica2 = (ColorFactory)FactoryProducer.getFactory("COLOR");
		
		Forma fig1 = fabrica1.getForma("TRIANGULO");
		
		//
		ClienteSingleton c1 = ClienteSingleton.getInstance();
		ClienteSingleton c2 = ClienteSingleton.getInstance();		// Devuelve el mismo objeto --> c1 y c2 apuntan al mismo
		
		//Patron builder
		ComensalBuilder cb = new ComensalBuilder();
		Comensal co1 = cb.prepareMenu1();		// te ahorras el hacer todos los setters setPatatas... por ejemplo...
		Comensal co2 = cb.prepareMenu2();
		
		//Patrón iterator
		ColeccionArray col = new ColeccionArray(1,2,3,4,5);
		Iterator it = col.getIterator();			//obtengo el iterador
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
		// El bucle for (Clase variable : instancia) sólo se puede hacer para clases que implementen Iterator
		
		Cliente cliente = new Cliente(1,"Pepito", 18);
		it = cliente.getIterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
		//Patrón observer
		ReceptorEvento oyente = new ReceptorEvento();
		EmisorEvento emisor = new EmisorEvento();
		
		emisor.addObserver(oyente);
		emisor.addAlgo();
		emisor.eliminar();
	}

}
