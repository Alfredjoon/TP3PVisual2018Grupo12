/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Alfred
 */
public class Triangulo {
    
    private Punto03 puntoA;
    private Punto03 puntoB;
    private Punto03 puntoC;

    public Triangulo() {
        
    }

    public Punto03 getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Punto03 puntoA) {
        this.puntoA = puntoA;
    }

    public Punto03 getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Punto03 puntoB) {
        this.puntoB = puntoB;
    }

    public Punto03 getPuntoC() {
        return puntoC;
    }

    public void setPuntoC(Punto03 puntoC) {
        this.puntoC = puntoC;
    }

    public Triangulo(Punto03 puntoA, Punto03 puntoB, Punto03 puntoC) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
        this.puntoC = puntoC;
    }
    
    public void verificarTriangulo(){
    int distanciaAB;
    int distanciaBC;
    int distanciaCA;
    distanciaAB=(int) Math.sqrt(Math.pow(this.puntoB.getCoordenadaX()-this.puntoA.getCoordenadaX(),2)+Math.pow(this.puntoB.getCoordenadaY()-this.puntoA.getCoordenadaY(),2));
    distanciaBC=(int) Math.sqrt(Math.pow(this.puntoC.getCoordenadaX()-this.puntoB.getCoordenadaX(),2)+Math.pow(this.puntoC.getCoordenadaY()-this.puntoB.getCoordenadaY(),2));
    distanciaCA=(int) Math.sqrt(Math.pow(this.puntoA.getCoordenadaX()-this.puntoC.getCoordenadaX(),2)+Math.pow(this.puntoA.getCoordenadaY()-this.puntoC.getCoordenadaY(),2));
    
        if (distanciaBC + distanciaBC>distanciaCA &&distanciaAB + distanciaCA>distanciaBC && distanciaBC+distanciaCA>distanciaAB) {
            
            System.out.println("Se ah formado la figura");
            
        } else {
            System.out.println("No puntos no corresponden a un triangulo");
            
        }
    }
    
}
