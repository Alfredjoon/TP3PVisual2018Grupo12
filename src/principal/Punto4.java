/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Alfred
 */
public class Punto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        
        Scanner scan = new Scanner (System.in);
        int [] arregloEnteros = new int[10];
        int maximo=0;
        int minimo=0;
        int suma=0;
        int promedio;
       
        for (int i = 0 ; i<=arregloEnteros.length;i++){
        System.out.println("Ingrese numero al arreglo");
        arregloEnteros[i]= scan.nextInt();
        if (arregloEnteros[i]>maximo){
            maximo=arregloEnteros[i];
        }else if (arregloEnteros[i]< minimo){
            minimo=arregloEnteros[i];}
        suma=suma+arregloEnteros[i];
        }
        promedio=suma/10;
        System.out.println("el maximo numero es " +maximo);
        System.out.println("el minimo numero es " +minimo);
        System.out.println("el promedio de los numeros es " +promedio);
    }
    
}
