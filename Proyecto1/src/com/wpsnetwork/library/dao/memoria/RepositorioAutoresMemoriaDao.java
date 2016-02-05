package com.wpsnetwork.library.dao.memoria;

import java.util.Arrays;
import java.util.List;

import com.wpsnetwork.library.dao.entidades.Autor;
import com.wpsnetwork.library.dao.entidades.CategoriaLibro;
import com.wpsnetwork.library.dao.interfaces.Dao;

public class RepositorioAutoresMemoriaDao implements Dao<Autor>{
    
	public static List<Autor> autores = Arrays.asList(new Autor(1, "Antonio"), new Autor(2, "Pepe"), new Autor(3, "Anonimo"));
	
	// se pueden inicializar aqui variables estaticas
	static{
		
	}
	
	@Override
	public Autor get(int id) {
		return null;
	}

	@Override
	public void insert(Autor elemento) {
		
	}

	@Override
	public void update(Autor elemento) {
		
	}

	@Override
	public void delete(Autor elemento) {
		
	}

	@Override
	public List<Autor> getAll() {
		return null;
	}

}
