package punto07.test;

import java.util.Scanner;

import punto07.dominio.Auto;
import punto07.util.Autos;

public class TestAutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autos autoss=new Autos();
		Auto unAuto=new Auto();
		Scanner teclado = new Scanner(System.in);
		autoss.precargarAutos();
		
		 
			int op;
			do {
				System.out.println("elija una opcion: ");
				System.out.println("1--mostrar lista de autos");
				System.out.println("2--modificar auto");
				System.out.println("3--salir");
				op = teclado.nextInt();

				switch (op) {
				case 1: {
					 autoss.mostrarListaAutos();

				}

					break;
				case 2: {
					 autoss.editarAuto();
				}

					break;

				default:
					break;
				}
				
			} while (op!=3);


	}

}
