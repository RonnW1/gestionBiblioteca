package com.gestionLibros.demo.domain.valueObj.libro;

public class Tipo {
	private String value;

	public Tipo(String value) {
		if (value != null || !value.isEmpty()) {
			this.value = value;
		}
		System.out.println("El tipo no puede ser nulo, o vacio");
	}

	public String getValue() {
		return value;
	}
}
