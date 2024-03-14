package com.gestionLibros.demo.infraestructure.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Autor extends CrudRepository<com.gestionLibros.demo.infraestructure.modelEntity.Autor,Integer> {
}
