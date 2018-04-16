package punto06.util;

import java.util.ArrayList;

import punto06.dominio.Rectangulo;

public class Rectangulos {
	private ArrayList<Rectangulo> rectangulos = new ArrayList<Rectangulo>();

	public ArrayList<Rectangulo> getRectangulos() {
		return rectangulos;
	}

	public void setRectangulos(ArrayList<Rectangulo> rectangulos) {
		this.rectangulos = rectangulos;
	}

	public void quitarRectangulo(int posicion) {

		this.rectangulos.remove(posicion);

	}

	public void agregarRectangulo(Rectangulo unRectangulo) {

		this.rectangulos.add(unRectangulo);

	}

	public void mostrarRectangulos() {

		int cont = 0;
		for (Rectangulo rec : this.getRectangulos()) {

			System.out.println("posicion: " + cont);
			System.out.println("base: " + rec.getBase());
			System.out.println("altura: " + rec.getAltura());

			System.out.println("area: " + rec.optenerArea());
			System.out.println("superficie: " + rec.optenerSuperficie());
			cont++;

		}
	}

}