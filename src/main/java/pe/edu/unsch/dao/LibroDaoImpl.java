package pe.edu.unsch.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Autor;
import pe.edu.unsch.entities.Libro;

@Repository("libroDao")
public class LibroDaoImpl implements LibroDao {
	@Override
	public List<Libro> listarLibro(){
		Autor autor = new Autor("Nombre1", "Apellido1");
		List<Libro> libros = new ArrayList<>();
		libros.add(new Libro(1, "Introduction Spring", autor));
		libros.add(new Libro(2, "Introduction Spring 2", autor));
		
		return libros;
		
	}
	

}
