package com.gestionLibros.demo.domain.valueObj.Autor;

public class Cedula {
	private String value;

	public Cedula(String value) {
		if (!value.isEmpty()){
			this.value = value;
		}
	}

	public String getValue() {
		return value;
	}
}
