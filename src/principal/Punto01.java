/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.Punto;

/**
 *
 * @author tito
 */
public class Punto01 {
    public static void main(String[] args) {
        Punto punto1 = new Punto(1, 2);
        Punto punto2 = new Punto(3,4);
        
        System.out.println("La distancia entre los Puntos es: " + punto1.calcularDistanciaEntreDosPuntos(punto1, punto2));
    }
}
