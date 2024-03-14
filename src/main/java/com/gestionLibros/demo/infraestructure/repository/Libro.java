package com.gestionLibros.demo.infraestructure.repository;

import org.springframework.data.repository.CrudRepository;

public interface Libro extends CrudRepository<Libro,Integer> {
}
