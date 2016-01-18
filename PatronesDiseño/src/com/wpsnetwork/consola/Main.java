package com.wpsnetwork.consola;

import com.wpsnetwork.patrones.abstractfactory.ColorFactory;
import com.wpsnetwork.patrones.abstractfactory.FactoryProducer;
import com.wpsnetwork.patrones.abstractfactory.FormaFactory;
import com.wpsnetwork.patrones.abstractfactory.interfaces.Forma;
import com.wpsnetwork.patrones.factory.Paciente;
import com.wpsnetwork.patrones.factory.PacienteFactory;

public class Main {

	public static void main(String[] args) {
		//Patrón factory
		Paciente p1 = PacienteFactory.getPaciente("HOMBRE");
		Paciente p2 = PacienteFactory.getPaciente("MUJER");
		
		//Abstract factory
		FactoryProducer fabrica1 = (FormaFactory)FactoryProducer.getFactory("FORMA");
		FactoryProducer fabrica2 = (ColorFactory)FactoryProducer.getFactory("COLOR");
		
		Forma fig1 = fabrica1.getForma("TRIANGULO");
	}

}
