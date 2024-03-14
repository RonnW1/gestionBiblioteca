package com.gestionLibros.demo.infraestructure.service;

import com.gestionLibros.demo.infraestructure.modelEntity.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutorService implements AutorS {
	@Autowired
	private final com.gestionLibros.demo.infraestructure.repository.Autor autorRepo;

	public AutorService(com.gestionLibros.demo.infraestructure.repository.Autor autorRepo) {
		this.autorRepo = autorRepo;
	}

	@Override
	public Iterable<Autor> getAutorAll() {
		return autorRepo.findAll();
	}

	@Override
	public Autor addAutor(Autor autor) {
		return autorRepo.save(autor);
	}

	@Override
	public Integer deleteAutor(Integer id) {
		return null;
	}
}
