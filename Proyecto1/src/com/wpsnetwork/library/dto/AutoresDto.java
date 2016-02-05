package com.wpsnetwork.library.dto;

import java.util.List;

import com.wpsnetwork.library.dao.memoria.RepositorioAutoresMemoriaDao;
import com.wpsnetwork.library.dto.entidades.Autor;
import com.wpsnetwork.library.dto.entidades.Libro;

public class AutoresDto {
	private Autor autorDto = new Autor();
	private List<Libro> libros;

	public AutoresDto(RepositorioAutoresMemoriaDao repAutor) {
		super();
		
//		libros <- getAll
	}
}
