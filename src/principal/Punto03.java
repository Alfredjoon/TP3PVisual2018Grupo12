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
        System.out.println("ingrese cordenadas Y del punto A");
        int cordenadaAy= scan.nextInt();
            t.setPuntoA(new dominio.Punto03(cordenadaAx, cordenadaAy));
        System.out.println("ingrese cordenadas X del punto B");
        int cordenadaBx= scan.nextInt();
        System.out.println("ingrese cordenadas Y del punto B");
        int cordenadaBy= scan.nextInt();
            t.setPuntoB(new dominio.Punto03(cordenadaBx, cordenadaBy));
        System.out.println("ingrese cordenadas X del punto C");
        int cordenadaCx= scan.nextInt();
        System.out.println("ingrese cordenadas X del punto C");
        int cordenadaCy= scan.nextInt();
            t.setPuntoC(new dominio.Punto03(cordenadaCx, cordenadaCy));
        
       t.verificarTriangulo();
       
        
        
        
        
        
    }
    
}
