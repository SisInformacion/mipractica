package pe.edu.unsch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.unsch.servicio.LibroService;

@Controller
@RequestMapping
public class IndexController {
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("libros", libroService.listarLibro());
		return "view/index";

	}

	@Autowired
	private LibroService libroService;

}