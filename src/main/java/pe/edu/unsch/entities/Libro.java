package pe.edu.unsch.entities;

public class Libro {
	private int idLibro;
	private String nombre;
	private Autor autor;
	
	public Libro(int idLibro, String nombre, Autor autor) {
		super();
		this.idLibro = idLibro;
		this.nombre = nombre;
		this.autor = autor;
	}
	
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
}
