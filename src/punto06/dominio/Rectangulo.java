package punto06.dominio;

public class Rectangulo {
private double base, altura, superficie, area;

public Rectangulo() {
	super();
}




public Rectangulo(double base, double altura) {
	super();
	this.base = base;
	this.altura = altura;
}




public Rectangulo(double base, double altura, double superficie, double area) {
	super();
	this.base = base;
	this.altura = altura;
	this.superficie = superficie;
	this.area = area;
}

public double getSuperficie() {
	return superficie;
}

public void setSuperficie(double superficie) {
	this.superficie = superficie;
}

public double getArea() {
	return area;
}

public void setArea(double area) {
	this.area = area;
}

public double getBase() {
	return base;
}

public void setBase(double base) {
	this.base = base;
}

public double getAltura() {
	return altura;
}

public void setAltura(double altura) {
	this.altura = altura;
}

public double optenerSuperficie() {
	
	 superficie = 2*base+2*altura;
	return superficie;

}
public double optenerArea() {
	
	area = base*altura;
	return area;

}

}

