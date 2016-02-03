package com.wpsnetwork.dto;

import java.util.List;

import com.wpsnetwork.dao.memoria.RepositorioAutoresMemoriaDao;
import com.wpsnetwork.dto.entidades.Autor;
import com.wpsnetwork.dto.entidades.Libro;

public class AutoresDto {
	private Autor autorDto = new Autor();
	private List<Libro> libros;

	public AutoresDto(RepositorioAutoresMemoriaDao repAutor) {
		super();
		
//		libros <- getAll
	}
}
