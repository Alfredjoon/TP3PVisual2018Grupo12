package punto08.test;

import java.util.Scanner;

import punto08.dominio.Libro;
import punto08.util.Libros;

public class TestLibros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libros libross=new Libros();
		Libro unLibro=new Libro();
		libross.precargarLibros();
		libross.mostrarListaLibros();
		Scanner teclado = new Scanner(System.in);
		int op;
		do {
			System.out.println("elija una opcion: ");
			System.out.println("1--mostrar lista de libros");
			System.out.println("2--agregar un libro");
			System.out.println("3--salir");
			op = teclado.nextInt();

			switch (op) {
			case 1: {
				libross.mostrarListaLibros();

			}

				break;
			case 2: {
				libross.agregarLibro();
			}

				break;

			default:
				break;
			}
			
		} while (op!=3);


	}

}
