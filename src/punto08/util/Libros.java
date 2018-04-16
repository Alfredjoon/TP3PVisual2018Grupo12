package punto08.util;

import java.util.ArrayList;
import java.util.Scanner;

import punto05.dominio.Circulo;
import punto07.dominio.Auto;
import punto08.dominio.Libro;

public class Libros {
	ArrayList<Libro> listaLibros = new ArrayList<>();
	Libro unLibro = new Libro();

	public Libros() {
		super();
	}

	public Libros(ArrayList<Libro> listalibros, Libro unLibro) {
		super();
		this.listaLibros = listalibros;
		this.unLibro = unLibro;
	}

	public ArrayList<Libro> getListalibros() {
		return listaLibros;
	}

	public void setListalibros(ArrayList<Libro> listalibros) {
		this.listaLibros = listalibros;
	}

	public Libro getUnLibro() {
		return unLibro;
	}

	public void setUnLibro(Libro unLibro) {
		this.unLibro = unLibro;
	}

	public void precargarLibros() {

		listaLibros.add(new Libro("libro 0", "Destino Final", "Juan J ", 1));
		listaLibros.add(new Libro("libro 1", "La Bruja", "J J ", 156));
		listaLibros.add(new Libro("libro 2", "La Bruja", "Jose J ", 122));
		listaLibros.add(new Libro("libro 3", "La Bruja", "J J ", 13));
		listaLibros.add(new Libro("libro 4", "Suben y Bajan", "J J Lopez ", 125));
		listaLibros.add(new Libro("libro 5", "Destino Final", "Perez A.", 72));
		listaLibros.add(new Libro("libro 6", "El Aro", "R J ", 45));
	}

	public void agregarLibro() {
		String isbm, titulo, autor;
		double presio;
		Scanner teclado2 = new Scanner(System.in);

		System.out.println("editando; ");

		System.out.println("ingrese ISBM: ");
		isbm = teclado2.nextLine();

		System.out.println("ingrese titulo: ");
		titulo = teclado2.nextLine();

		System.out.println("ingrese autor: ");
		autor = teclado2.nextLine();

		System.out.println("ingrese presio: ");
		presio = teclado2.nextDouble();
		Libro libroAgregado = new Libro(isbm, titulo, autor, presio);

		this.listaLibros.add(libroAgregado);
	}

	public void mostrarListaLibros() {
		for (Libro li : this.getListalibros()) {
			System.out.println("ISBM: " + li.getISBM() + "\t" + "titulo: " + li.getTitulo() + "\t" + "autor:  "
					+ li.getAutor() + "\t" + "presio: " + li.getPrecio());

		}

	}

}
