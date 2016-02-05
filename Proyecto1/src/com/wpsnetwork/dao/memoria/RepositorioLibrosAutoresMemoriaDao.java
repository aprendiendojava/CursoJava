package com.wpsnetwork.dao.memoria;

import java.util.Arrays;
import java.util.List;

import com.wpsnetwork.dao.entidades.LibroAutor;
import com.wpsnetwork.dao.interfaces.Dao;

public class RepositorioLibrosAutoresMemoriaDao implements Dao<LibroAutor> {

	public static List<LibroAutor> librosAutores = Arrays.asList(new LibroAutor(1,2,2), new LibroAutor(2,1,2), new LibroAutor(3,3,1));
	
	@Override
	public LibroAutor get(int id) {
		return null;
	}

	@Override
	public void insert(LibroAutor elemento) {
		
	}

	@Override
	public void update(LibroAutor elemento) {
		
	}

	@Override
	public void delete(LibroAutor elemento) {
		
	}

	@Override
	public List<LibroAutor> getAll() {
		return null;
	}

}
