package punto05.util;

import java.util.ArrayList;

import punto05.dominio.Circulo;

public class Circulos {
	private ArrayList<Circulo> circulos = new ArrayList<>();

	
	
	public ArrayList<Circulo> getCirculos() {
		return circulos;
	}

	public void setCirculos(ArrayList<Circulo> circulos) {
		this.circulos = circulos;
	}

	public Circulos(ArrayList<Circulo> circulos) {
		super();
		this.circulos = circulos;
	}

	public Circulos() {
		super();
	}
	public void precargarCirculos(){
                //hace una carga inicial de circulos al array circulos
		System.out.println("precargados");
		Circulo c1 = new Circulo(3.4);
		Circulo c2 = new Circulo(5.4);
		this.circulos.add(c1);
		this.circulos.add(c2);
		
		
	}

	
	
	
	public void agregarCirculo(Circulo circulo) {

		this.circulos.add(circulo);
	}

	public void mostrarCirculos() {
		
				
		for (Circulo circulo : this.getCirculos()) {
			System.out.println("Radio: " +circulo.getRadio()+ "\t"+"superficie: " + circulo.calcularSuperficie(circulo.getRadio())+ "\t");
			
		}

	}
}
