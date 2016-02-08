package com.wpsnetwork.library.dao.memoria;

import java.util.Arrays;
import java.util.List;

import com.wpsnetwork.library.dao.entidades.Libro;
import com.wpsnetwork.library.dao.interfaces.Dao;

public class RepositorioLibrosMemoriaDao implements Dao<Libro>{

	private static List<Libro> libros = Arrays.asList(new Libro(1, "La sombra del viento", 1000, "Planeta", 2)
													, new Libro(2, "Los pilares de la tierra", 5000, "Larousse", 4)
													, new Libro(3, "Los renglones torcidos de Dios", 800, "Circulo rojo", 2));
			
	@Override
	public Libro get(int id) {
		return null;
	}

	@Override
	public void insert(Libro elemento) {
		
	}

	@Override
	public void update(Libro elemento) {
		
	}

	@Override
	public void delete(Libro elemento) {
		
	}

	@Override
	public List<Libro> getAll() {
		return null;
	}

}
