package com.gestionLibros.demo.infraestructure.endPoint;

import com.gestionLibros.demo.application.useCase.AutorUseCase;
import com.gestionLibros.demo.infraestructure.modelEntity.Autor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {
	private AutorUseCase autorUseCase;
	/*@GetMapping(path = "/hola")
	public @RequestBody Iterable<Autor> getAll(){return
	}*/
}
