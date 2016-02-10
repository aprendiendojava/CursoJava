package com.wpsnetwork.library.dao.memoria;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.wpsnetwork.library.dao.entidades.Persona;
import com.wpsnetwork.library.dao.interfaces.Dao;

public class RepositorioPersonasMemoriaDao implements Dao<Persona> {

	public static List<Persona> personas = Arrays.asList(
			new Persona(1, "Persona1", "dni1", new Date(), "direccion1", "telefono1", "pais1", "provincia1", "codpostal1")
			, new Persona(2, "Persona2", "dni2", new Date(), "direccion2", "telefono2", "pais2", "provincia2", "codpostal2")
			, new Persona(3, "Persona3", "dni3", new Date(), "direccion3", "telefono3", "pais3", "provincia3", "codpostal3"));
	
	@Override
	public Persona get(int id) {
		return (Persona) personas.stream().filter(e -> e.getId() == id);
	}

	@Override
	public void insert(Persona elemento) {
		//miramos si hay un id igual, en caso contrario, insertamos
		boolean hayIguales = false;
		for(Persona persona:personas){
			if(persona.equals(elemento)){
				hayIguales = true;
			}
		}
		if(!hayIguales){
			personas.add(elemento);
		}
				
	}

	@Override
	public void update(Persona elemento) {
		boolean borrado = personas.remove(elemento);
		if(borrado){
			personas.add(elemento);
		}
	}

	@Override
	public void delete(Persona elemento) {
		personas.remove(elemento);
	}

	@Override
	public List<Persona> getAll() {
		List<Persona> personasDao = Arrays.asList(this.personas.get(0), this.personas.get(1), this.personas.get(2));
		return personasDao;
	}
	
	@Override
	public String toString() {
		return "RepositorioPersonasMemoriaDao [getAll()=" + getAll().toString() + "]";
	}
}
