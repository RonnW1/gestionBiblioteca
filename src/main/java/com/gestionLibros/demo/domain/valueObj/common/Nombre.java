package com.gestionLibros.demo.domain.valueObj.common;

public class Nombre {
	private String value;

	public Nombre(String value) {
		if (value != null || !value.isEmpty()) {
			this.value = value;
		}
		System.out.println("El nombre no puede ser nulo, o vacio");
	}

	public String getValue() {
		return value;
	}
}
