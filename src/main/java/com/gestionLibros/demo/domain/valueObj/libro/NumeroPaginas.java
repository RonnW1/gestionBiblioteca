package com.gestionLibros.demo.domain.valueObj.libro;

public class NumeroPaginas {
	private Integer value;

	public NumeroPaginas(Integer value) {
		if (value > 0) {
			this.value = value;
		}
		System.out.println("El numero de paginas no debe ser 0");
	}

	public Integer getValue() {
		return value;
	}
}
