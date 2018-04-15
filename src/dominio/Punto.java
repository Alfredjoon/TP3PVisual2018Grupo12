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
public class Punto {
    
   private double coordenadaX;
   private double coordenadaY;

    public Punto(double coordenadaX, double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public Punto() {
    }

    
    public double calcularDistanciaEntreDosPuntos(Punto puntoB){
       return Math.sqrt( Math.pow((puntoB.coordenadaX - this.coordenadaX), 2) + Math.pow((puntoB.coordenadaY - this.coordenadaY), 2) );
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
    
    public void mostrarPuntos(Punto[] puntos){
        Punto[] listaPuntos = puntos;
        int count=2;
        for (Punto p : listaPuntos) {
            System.out.println("Punto"+ count +" (X-Y): (" + p.getCoordenadaX()+" - "+ p.getCoordenadaY() +")");
            count++;
        }
        
    }
    
    
    public double getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
   
   
    
}
