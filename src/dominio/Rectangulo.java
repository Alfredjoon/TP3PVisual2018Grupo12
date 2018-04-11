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

    public void mostrarPuntos(){
        Punto[] listaPuntos = cargarPuntos();
        int count=2;
        for (Punto p : listaPuntos) {
            System.out.println("Punto"+ count +" (X-Y): (" + p.getCoordenadaX()+" - "+ p.getCoordenadaY() +")");
            count++;
        }
            
        
    }
    
    public Punto[] cargarPuntos(){
        Punto[] puntos = new Punto[3];
            puntos[0] = calcularPunto(2,this.punto1, this.base);
            puntos[1] = calcularPunto(3,puntos[0],this.altura);
            puntos[2] = calcularPunto(4,this.punto1, this.altura);
        
        return puntos;        
    }
    
    public Punto calcularPunto(int numPunto, Punto punto, double aux){
        Punto puntoAux = new Punto();
       switch(numPunto){
           case 2:
               puntoAux.setCoordenadaX( punto.getCoordenadaX() + aux );
               puntoAux.setCoordenadaY( punto.getCoordenadaY());
               break;
           case 3:
               puntoAux.setCoordenadaX( punto.getCoordenadaX());
               puntoAux.setCoordenadaY( punto.getCoordenadaY() + aux );               
               break;
           case 4:   
               puntoAux.setCoordenadaX( punto.getCoordenadaX());
               puntoAux.setCoordenadaY( punto.getCoordenadaY() + aux );
               break;
       }
      return puntoAux;
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
