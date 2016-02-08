package com.wpsnetwork.library.dto;

import java.util.List;

import com.wpsnetwork.library.dao.memoria.RepositorioAutoresMemoriaDao;
import com.wpsnetwork.library.dto.entidades.Autor;
import com.wpsnetwork.library.dto.entidades.Libro;

public class AutoresDto {
	private Autor autorDto = new Autor();
	private List<Libro> libros;

	public AutoresDto(RepositorioAutoresMemoriaDao repAutor, int id) {
		super();
		autorDto.setId(id);
		autorDto.setNombre(repAutor.get(id).getNombre());
//		for(Autor a:repAutor.getAll()){
//			libros.add(a.);
//		}
		
	}
}
