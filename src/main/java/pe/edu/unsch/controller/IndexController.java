package pe.edu.unsch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.unsch.entities.Libro;
import pe.edu.unsch.servicio.LibroService;

@Controller
@RequestMapping
public class IndexController {
	@GetMapping("/index")
	public String index() {
		List<Libro> libros = libroService.listarLibro();
		for (Libro libro : libros) {
			System.out.println(libro);
		}

		return "view/index";

	}

	@Autowired
	private LibroService libroService;

}