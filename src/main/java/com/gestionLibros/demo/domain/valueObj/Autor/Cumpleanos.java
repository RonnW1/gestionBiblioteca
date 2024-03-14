package com.gestionLibros.demo.domain.valueObj.Autor;

import java.time.LocalDate;

public class Cumpleanos {
	private LocalDate value;

	public Cumpleanos(LocalDate value) {
		if (value.isAfter(LocalDate.now())){
			this.value = value;
		}
		System.out.println("La fecha de cumpleaños no puede ser igual o mayor a la actual");
	}

	public LocalDate getValue() {
		return value;
	}
}
