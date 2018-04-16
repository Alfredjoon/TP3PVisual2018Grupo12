/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author tito
 */
public class Rectangulo {
    
    private Punto punto1;
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(Punto punto1, double base, double altura) {
        this.punto1 = punto1;
        this.base = base;
        this.altura = altura;
    }

    public Punto[] cargarPuntosDeRectangulo(){
        Punto[] puntos = new Punto[3];
            puntos[0] = punto1.calcularPunto(2,this.punto1, this.base);
            puntos[1] = punto1.calcularPunto(3,puntos[0],this.altura);
            puntos[2] = punto1.calcularPunto(4,this.punto1, this.altura);
        
        return puntos;        
    }
    
    public double calcularSuperficieRectangulo(){
        return this.base*this.altura;
    }
    
    public double calcularPerimetroRectangulo(){
        return 2*this.base + 2*this.altura;
    }
    
    public void mostrarPuntos(){
       punto1.mostrarPuntos(cargarPuntosDeRectangulo());
    }
    
    public void mostrarSuperficie(){
        System.out.println("La Superficie del rectangulo es: " + calcularSuperficieRectangulo());
    }
    
    public void mostrarPerimetro(){
        System.out.println("El Perimetro del rectangulo es: " + calcularPerimetroRectangulo());
    }
    
    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
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
    
    
    
    
}
