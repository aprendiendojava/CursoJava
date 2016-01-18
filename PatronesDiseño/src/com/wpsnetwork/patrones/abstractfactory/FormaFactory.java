package com.wpsnetwork.patrones.abstractfactory;

import com.wpsnetwork.patrones.abstractfactory.interfaces.Color;
import com.wpsnetwork.patrones.abstractfactory.interfaces.Forma;
import com.wpsnetwork.patrones.abstractfactory.Circulo;
import com.wpsnetwork.patrones.abstractfactory.Triangulo;
import com.wpsnetwork.patrones.abstractfactory.Rectangulo;

public class FormaFactory extends AbstractFactory {
	public Forma getForma (String tipoForma){
		Forma forma= null;
		
		if (tipoForma.equalsIgnoreCase("CIRCULO"))
			forma = new Circulo();
		else if (tipoForma.equalsIgnoreCase("TRIANGULO"))
			forma = new Triangulo();
		else if (tipoForma.equalsIgnoreCase("RECTANGULO"))
			forma = new Rectangulo();
		
		return forma;
	}

	@Override
	public Color getColor(String tipoColor) {
		// TODO Auto-generated method stub
		return null;
	}
}
