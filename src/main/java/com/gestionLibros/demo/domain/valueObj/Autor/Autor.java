package com.gestionLibros.demo.domain.valueObj.Autor;

import com.gestionLibros.demo.domain.valueObj.common.Id;
import com.gestionLibros.demo.domain.valueObj.common.Nombre;

public class Autor {
	private Id id;
	private Nombre nombre;
	private Cedula cedula;
	private Cumpleanos cumpleanos;
	private Edad edad;

	public Autor(Id id, Nombre nombre, Cedula cedula, Cumpleanos cumpleanos, Edad edad) {
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
		this.cumpleanos = cumpleanos;
		this.edad = edad;
	}

	public Id getId() {
		return id;
	}

	public Nombre getNombre() {
		return nombre;
	}

	public Cedula getCedula() {
		return cedula;
	}

	public Cumpleanos getCumpleanos() {
		return cumpleanos;
	}

	public Edad getEdad() {
		return edad;
	}
}
