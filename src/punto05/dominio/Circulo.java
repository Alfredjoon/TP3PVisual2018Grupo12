package punto05.dominio;

//clase del dominio
public class Circulo {
	private double radio;
	

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	

	public Circulo(double radio) {
		super();
		this.radio = radio;
	
	}

	public Circulo() {
		super();
	}
	public double calcularSuperficie(double radio){
		return(3.1416*radio);
		
	}

}
