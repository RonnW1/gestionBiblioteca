package com.gestionLibros.demo.domain.valueObj.Autor;

public class Edad {
	private Integer value;

	public Edad(Integer value) {
		if (value > 0) {
			this.value = value;
		}
		System.out.println("La edad debe ser mayor a 0");
	}

	public Integer getValue() {
		return value;
	}
}
