package com.wpsnetwork.consola;

import com.wpsnetwork.entidades.Figura;
import com.wpsnetwork.entidades.Figura.Coordenada2D;

public class Test {

	public static void main(String[] args) {
		Coordenada2D posicion = new Coordenada2D(1,2);
		Figura fig1 = new Figura(posicion);
		
		// También se puede hacer así
//		Figura fig1 = new Figura(new Coordenada2D(1,2));
	}

}
