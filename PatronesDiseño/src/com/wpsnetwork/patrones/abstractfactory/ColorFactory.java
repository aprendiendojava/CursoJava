package com.wpsnetwork.patrones.abstractfactory;

import com.wpsnetwork.patrones.abstractfactory.interfaces.Color;
import com.wpsnetwork.patrones.abstractfactory.interfaces.Forma;
import com.wpsnetwork.patrones.abstractfactory.Rojo;

public class ColorFactory extends AbstractFactory {
	public Color getColor (String tipoColor){
		Color color= null;
		
		if (tipoColor.equalsIgnoreCase("VERDE"))
			color = new Verde();
		else if (tipoColor.equalsIgnoreCase("ROJO"))
			color = new Rojo();
		
		return color;
	}

	@Override
	public Forma getForma(String tipoForma) {
		return null;
	}
}
