package com.gestionLibros.demo.domain.valueObj.libro;

public class Isbn {
	private String value;

	public Isbn(String value) {
		if (value != null || !value.isEmpty()) {
			this.value = value;
		}
		System.out.println("El ISBN no puede ser nulo, o vacio");
	}

	public String getValue() {
		return value;
	}
}
