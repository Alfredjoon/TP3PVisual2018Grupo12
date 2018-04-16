package punto06.test;

import java.util.Scanner;

import punto06.dominio.Rectangulo;
import punto06.util.Rectangulos;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulos rectangulos = new Rectangulos();

		Rectangulo rectangulo1 = new Rectangulo(2, 3);
		Rectangulo rectangulo2 = new Rectangulo(4, 5);
		Rectangulo rectangulo3 = new Rectangulo(6, 7);
		Rectangulo rectangulo4 = new Rectangulo(8, 9);

		rectangulos.agregarRectangulo(rectangulo1);
		rectangulos.agregarRectangulo(rectangulo2);
		rectangulos.agregarRectangulo(rectangulo3);
		rectangulos.agregarRectangulo(rectangulo4);
		

		
		int op;
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		do {
			int posicion = 0;
			System.out.println("elija una opcion: ");
			System.out.println("1--mostrar lista de rectangulos");
			System.out.println("2--quitar rectangulo");
			System.out.println("3--salir");

			op = teclado.nextInt();

			switch (op) {
		
			case 1: {
				int cont = 0;
				
				for (Rectangulo rec : rectangulos.getRectangulos()) {

					System.out.println("posicion: " + cont + "\t" + "base: " + rec.getBase() + "\t" + "altura: "+ rec.getAltura() + "\t"+"superficie: "+rec.optenerSuperficie()+"\t"+"area: "+rec.optenerArea()+"\t");
					cont = cont + 1;

				}
				/* rectangulos.mostrarRectangulos(); */
			}

				break;
			case 2: {
				System.out.println("quitando rectangulo");
				System.out.println("ingrese posicion");
				posicion = teclado.nextInt();

				rectangulos.quitarRectangulo(posicion);
			}

				break;

			default:

				break;
			}

		} while (op != 3);

		

	}

}
