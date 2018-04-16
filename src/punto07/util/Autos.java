package punto07.util;

import java.util.ArrayList;
import java.util.Scanner;

import punto05.dominio.Circulo;
import punto07.dominio.Auto;

public class Autos {
	ArrayList<Auto> listaAutos = new ArrayList<>();
	Auto unAuto = new Auto();
	Scanner teclado = new Scanner(System.in);

	public Autos(ArrayList<Auto> listaAutos, Auto unAuto) {
		super();
		this.listaAutos = listaAutos;
		this.unAuto = unAuto;
	}

	public Autos() {
		super();
	}

	public ArrayList<Auto> getListaAutos() {
		return listaAutos;
	}

	public void setListaAutos(ArrayList<Auto> listaAutos) {
		this.listaAutos = listaAutos;
	}

	public Auto getUnAuto() {
		return unAuto;
	}

	public void setUnAuto(Auto unAuto) {
		this.unAuto = unAuto;
	}

	public void precargarAutos() {
		System.out.println("precargados");
		/* Auto a1 = new Auto(1,"ABC122","FORD", "AZUL", "2017", "NAFTA"); */
		listaAutos.add(new Auto(0, "ABC122", "FORD", "AZUL", "2017", "NAFTA"));
		listaAutos.add(new Auto(1, "ABC123", "CHEVROLET", "NEGRO", "2008", "NAFTA"));
		listaAutos.add(new Auto(2, "ABC124", "RENAULT", "VERDE", "1998", "NAFTA"));
		listaAutos.add(new Auto(3, "ABC125", "FORD", "AMARILLO", "2000", "NAFTA"));
		listaAutos.add(new Auto(4, "ABC126", "FORD", "MARRON", "2010", "NAFTA"));
		listaAutos.add(new Auto(5, "ABC127", "RENAULT", "ROJO", "2010", "NAFTA"));
		listaAutos.add(new Auto(6, "ABC128", "FIAT", "GRIS", "2010", "NAFTA"));

		
	}

	public void mostrarListaAutos() {
		for (Auto au : this.getListaAutos()) {
			System.out.println("id: "+au.getId()+"\t"+"patente: " + au.getPatente() + "\t" + "marca: " + au.getMarca() + "\t" + "color: "
					+ au.getColor() + "\t" + "modelo: " + au.getModelo() + "\t" + "combustible: " + au.getTipComb());

		}

	}

	public void editarAuto() {
		String pat, mar, col, mod, comb;
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("ingrese posicion: ");
		int posicion = teclado2.nextInt();

		System.out.println("editando; ");
		
		System.out.println("ingrese patente: ");
		pat = teclado2.nextLine();

		System.out.println("ingrese marca: ");
		mar = teclado2.nextLine();

		System.out.println("ingrese color: ");
		col = teclado2.nextLine();

		System.out.println("ingrese modelo: ");
		mod = teclado2.nextLine();

		System.out.println("ingrese tipo de combustible: ");
		comb = teclado2.nextLine();

		Auto autoEditado = new Auto(posicion, pat, mar, col, mod, comb);
		listaAutos.set(posicion, autoEditado);

	}
}
