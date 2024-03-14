package com.gestionLibros.demo.infraestructure.service;

import com.gestionLibros.demo.infraestructure.modelEntity.Autor;

import java.util.ArrayList;

public interface AutorS {
	public Iterable<Autor> getAutorAll();

	public Autor addAutor(Autor autor);

	public Integer deleteAutor(Integer id);
}
