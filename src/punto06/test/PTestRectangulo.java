package punto06.test;

import java.util.Scanner;

import punto06.dominio.Rectangulo;
import punto06.util.Rectangulos;

public class PTestRectangulo {

	public static void main(String[] args) {
		Rectangulo unRectangulo = new Rectangulo();
		Rectangulos rectangulos = new Rectangulos();
		int posicion = 0;
		int op;
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		do{
			System.out.println("elija una opcion: ");
			System.out.println("1--mostrar lista de rectangulos");
			System.out.println("2--agregar rectangulo");
			System.out.println("3--quitar rectangulo");
			System.out.println("4--salir");

			op = teclado.nextInt();

			switch (op) {
			case 1: {
				rectangulos.mostrarRectangulos();
			}

				break;
			case 2: {
				System.out.println("ingresando rectangulo");
				System.out.println("ingrese base");
				unRectangulo.setBase(teclado.nextDouble());
				System.out.println("ingrese altura");
				unRectangulo.setAltura(teclado.nextDouble());
				rectangulos.agregarRectangulo(unRectangulo);
			}

				break;

			case 3: {
				System.out.println("ingresando posicion a borrar");
				System.out.println("ingrese posicion");
				unRectangulo.setBase(teclado.nextDouble());
				rectangulos.quitarRectangulo(posicion);
			}

				break;
			default:

				break;
			}

			
		}while(op!=4);
		
	}

}
