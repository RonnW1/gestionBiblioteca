package com.gestionLibros.demo.domain.valueObj.libro;

import com.gestionLibros.demo.domain.valueObj.Autor.Autor;
import com.gestionLibros.demo.domain.valueObj.common.Id;
import com.gestionLibros.demo.domain.valueObj.common.Nombre;

public class Libro {
	private Id id;
	private Isbn isbn;
	private Tipo tipo;
	private Autor autor;
	private NumeroPaginas numeroPaginas;
	private Nombre nombre;

	public Libro(Id id, Isbn isbn, Tipo tipo, Autor autor, NumeroPaginas numeroPaginas, Nombre nombre) {
		this.id = id;
		this.isbn = isbn;
		this.tipo = tipo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.nombre = nombre;
	}

	public Id getId() {
		return id;
	}

	public Isbn getIsbn() {
		return isbn;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public Autor getAutor() {
		return autor;
	}

	public NumeroPaginas getNumeroPaginas() {
		return numeroPaginas;
	}

	public Nombre getNombre() {
		return nombre;
	}
}
