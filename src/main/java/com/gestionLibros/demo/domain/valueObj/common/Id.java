package com.gestionLibros.demo.domain.valueObj.common;

public class Id {
	private Integer value;

	public Id(Integer value) {
		if (value != null ) {
			this.value = value;
		}
		System.out.println("El id no puede ser nulo, o vacio");
	}

	public Integer getValue() {
		return value;
	}
}
