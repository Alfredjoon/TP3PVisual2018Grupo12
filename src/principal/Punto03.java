/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.Triangulo;
import java.util.Scanner;

/**
 *
 * @author Alfred
 */
public class Punto03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        Triangulo unTriangulo = null ;
        
        System.out.println("ingrese cordenadas X del punto A");
        int cordenadaAx= scan.nextInt();
        unTriangulo.getPuntoA().setCoordenadaX(cordenadaAx);
        System.out.println("ingrese cordenadas Y del punto A");
        int cordenadaAy= scan.nextInt();
        unTriangulo.getPuntoA().setCoordenadaY(cordenadaAy);
        System.out.println("ingrese cordenadas X del punto B");
        int cordenadaBx= scan.nextInt();
        unTriangulo.getPuntoA().setCoordenadaX(cordenadaBx);
        System.out.println("ingrese cordenadas Y del punto B");
        int cordenadaBy= scan.nextInt();
        unTriangulo.getPuntoA().setCoordenadaX(cordenadaBy);
        System.out.println("ingrese cordenadas X del punto C");
        int cordenadaCx= scan.nextInt();
        unTriangulo.getPuntoA().setCoordenadaX(cordenadaCx);
        System.out.println("ingrese cordenadas X del punto C");
        int cordenadaCy= scan.nextInt();
        unTriangulo.getPuntoA().setCoordenadaX(cordenadaCy);
        unTriangulo.verificarTriangulo();
        
    }
    
}
