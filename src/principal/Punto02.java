/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.Punto;
import dominio.Rectangulo;

/**
 *
 * @author tito
 */
public class Punto02 {
    public static void main(String[] args) {
        
        Rectangulo rectangulo = new Rectangulo(new Punto(3, 4), 12, 4);
        rectangulo.mostrarPuntos();
        
    }
}
