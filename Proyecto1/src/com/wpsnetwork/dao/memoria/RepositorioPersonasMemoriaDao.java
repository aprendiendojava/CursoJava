package com.wpsnetwork.dao.memoria;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.wpsnetwork.dao.entidades.Persona;
import com.wpsnetwork.dao.interfaces.Dao;

public class RepositorioPersonasMemoriaDao implements Dao<Persona> {

	public static List<Persona> personas = Arrays.asList(
			new Persona(1, "Persona1", "dni1", new Date(), "direccion1", "telefono1", "pais1", "provincia1", "codpostal1")
			, new Persona(2, "Persona2", "dni2", new Date(), "direccion2", "telefono2", "pais2", "provincia2", "codpostal2")
			, new Persona(3, "Persona3", "dni3", new Date(), "direccion3", "telefono3", "pais3", "provincia3", "codpostal3"));
	
	@Override
	public Persona get(int id) {
		return null;
	}

	@Override
	public void insert(Persona elemento) {
		
	}

	@Override
	public void update(Persona elemento) {
		
	}

	@Override
	public void delete(Persona elemento) {
		
	}

	@Override
	public List<Persona> getAll() {
		return null;
	}

}
