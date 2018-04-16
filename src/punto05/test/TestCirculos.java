package punto05.test;

import java.util.Scanner;

import punto05.dominio.Circulo;
import punto05.util.Circulos;

public class TestCirculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulos circuloss = new Circulos();
		Circulo unCirculo = new Circulo();
		circuloss.precargarCirculos();
		

		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int op;
		do {
			System.out.println("elija una opcion: ");
			System.out.println("1--mostrar lista de circulos");
			System.out.println("2--agregar circulo");
			System.out.println("3--salir");
			op = teclado.nextInt();

			switch (op) {
			case 1: {
				circuloss.mostrarCirculos();

			}

				break;
			case 2: {
				Scanner teclado2 = new Scanner(System.in);
				System.out.println("agregando");
				System.out.println("ingrese radio");
				unCirculo.setRadio(teclado.nextDouble());
				circuloss.agregarCirculo(unCirculo);

			}

				break;

			default:
				break;
			}
			
		} while (op!=3);


	}

}
