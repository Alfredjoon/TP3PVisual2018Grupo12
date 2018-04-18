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
        
        
       Triangulo t = new Triangulo();
       
       
       Scanner scan = new  Scanner (System.in);
        System.out.println("ingrese cordenadas X del punto A");
        int cordenadaAx= scan.nextInt();
        t.getPuntoA().setCoordenadaX(cordenadaAx);
        System.out.println("ingrese cordenadas Y del punto A");
        int cordenadaAy= scan.nextInt();
        t.getPuntoA().setCoordenadaY(cordenadaAy);
        System.out.println("ingrese cordenadas X del punto B");
        int cordenadaBx= scan.nextInt();
        t.getPuntoB().setCoordenadaX(cordenadaBx);
        System.out.println("ingrese cordenadas Y del punto B");
        int cordenadaBy= scan.nextInt();
        t.getPuntoB().setCoordenadaY(cordenadaBy);
        System.out.println("ingrese cordenadas X del punto C");
        int cordenadaCx= scan.nextInt();
        t.getPuntoC().setCoordenadaX(cordenadaCx);
        System.out.println("ingrese cordenadas X del punto C");
        int cordenadaCy= scan.nextInt();
        t.getPuntoC().setCoordenadaY(cordenadaCy);
     
       t.verificarTriangulo();
       
        
        
        
        
        
    }
    
}
