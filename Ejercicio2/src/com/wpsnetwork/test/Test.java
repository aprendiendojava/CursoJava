package com.wpsnetwork.test;

import java.util.ArrayList;
import java.util.Date;

import com.wpsnetwork.entidades.Alquiler;
import com.wpsnetwork.entidades.Particular;
import com.wpsnetwork.entidades.Piso;

public class Test {

	public static void main(String[] args) {
		
		Piso piso = new Piso(2, 3, 350);
		Particular particular = new Particular("Antonio", "12345675Q");
		Alquiler alquiler = new Alquiler(new Date(), particular, piso);
		ArrayList<Alquiler> listaAlquileres = new ArrayList();
		listaAlquileres.add(alquiler);
		alquiler.setListaAlquileres(listaAlquileres);
		
		Piso piso3 = new Piso(2, 2, 350);
		Particular particular1 = new Particular("Nueva", "12345672Q");
		Alquiler alquiler1 = new Alquiler(new Date(), particular1, piso3);
		listaAlquileres.add(alquiler1);
		alquiler1.setListaAlquileres(listaAlquileres);
		
		Piso piso1 = new Piso(1, 3, 375);
		Particular particular2 = new Particular("Julia", "12345671Q");
		Alquiler alquiler2 = new Alquiler(new Date(), particular2, piso1);
		listaAlquileres.add(alquiler2);
		alquiler2.setListaAlquileres(listaAlquileres);

		Piso piso2 = new Piso(1, 2, 400);
		Particular particular3 = new Particular("Juan", "12345673Q");
		Alquiler alquiler3 = new Alquiler(new Date(), particular3, piso2);
		listaAlquileres.add(alquiler3);
		alquiler3.setListaAlquileres(listaAlquileres);
		
		Piso piso4 = new Piso(1, 1, 400);
		Particular particular4 = new Particular("Mary", "12345674Q");
		Alquiler alquiler4 = new Alquiler(new Date(), particular4, piso4);
		listaAlquileres.add(alquiler4);
		alquiler4.setListaAlquileres(listaAlquileres);
		
		System.out.println(listaAlquileres.toString());

	}

}
