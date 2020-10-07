package pe.edu.unsch.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.unsch.dao.LibroDao;
import pe.edu.unsch.entities.Libro;

@Service("libroService")
public class LibroServiceImpl implements LibroService{
//Instanciar objetos para ahorrar codigo	
	@Autowired
	private LibroDao libroDao;
//sobrescribir un metodo ya mencionado 	
	@Override
	public List<Libro> listarLibro() {
		return libroDao.listarLibro();
		}
}
