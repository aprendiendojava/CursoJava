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
		return (Libro) libros.stream().distinct().filter(e -> e.getId() == id);
	}

	@Override
	public void insert(Libro elemento) {
		//miramos si hay un id igual, en caso contrario, insertamos
		boolean hayIguales = false;
		for(Libro libro: libros){
			if (libro.equals(elemento)){
				hayIguales = true;
			}
		}
		if(!hayIguales){
			libros.add(elemento);
		}
	}

	@Override
	public void update(Libro elemento) {
//		for(Libro libro:libros){
//			if(libro.equals(elemento)){
//				libro.setTitulo(elemento.getTitulo());
//				libro.setPaginas(elemento.getPaginas());
//				libro.setEditorial(elemento.getEditorial());
//				libro.setEdicion(elemento.getEdicion());
//			}
//		}
		boolean borrado = libros.remove(elemento);
		if(borrado){
			libros.add(elemento);
		}
	}

	@Override
	public void delete(Libro elemento) {
		libros.remove(elemento);
	}

	@Override
	public List<Libro> getAll() {
		List<com.wpsnetwork.library.dao.entidades.Libro> librosDao = Arrays.asList(this.libros.get(0)
				, this.libros.get(1)
				, this.libros.get(2));
		return librosDao;
	}

	@Override
	public String toString() {
		return "RepositorioLibrosMemoriaDao [getAll()=" + getAll().toString() + "]";
	}

}
