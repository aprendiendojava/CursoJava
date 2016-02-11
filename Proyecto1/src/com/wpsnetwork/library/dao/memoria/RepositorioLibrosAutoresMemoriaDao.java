package com.wpsnetwork.library.dao.memoria;

import java.util.Arrays;
import java.util.List;

import com.wpsnetwork.library.dao.entidades.LibroAutor;
import com.wpsnetwork.library.dao.interfaces.Dao;

public class RepositorioLibrosAutoresMemoriaDao implements Dao<LibroAutor> {

	private static List<LibroAutor> librosAutores = Arrays.asList(new LibroAutor(1,2,2), new LibroAutor(2,1,2), new LibroAutor(3,3,1));
	
	@Override
	public LibroAutor get(int id) {
		return (LibroAutor) librosAutores.stream().filter(e -> e.getId() == id);
	}

	@Override
	public void insert(LibroAutor elemento) {
		
	}

	@Override
	public void update(LibroAutor elemento) {
		boolean borrado = librosAutores.remove(elemento);
		if(borrado){
			librosAutores.add(elemento);
		}
	}

	@Override
	public void delete(LibroAutor elemento) {
		librosAutores.remove(elemento);
	}

	@Override
	public List<LibroAutor> getAll() {
		List<com.wpsnetwork.library.dao.entidades.LibroAutor> librosAutoresDao =
				Arrays.asList(this.get(0)
						, this.get(1)
						, this.get(2));
		return librosAutoresDao;
	}

	@Override
	public String toString() {
		return "RepositorioLibrosAutoresMemoriaDao [getAll()=" + getAll().toString() + "]";
	}

}
