/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import dominio.ArregloNumeros;
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
        ArregloNumeros arregloEnteros = new ArregloNumeros();
        int maximo=0;
        int minimo=0;
        int suma=0;
        int contador = 0;
        int promedio;
       
        while(contador<10){
        System.out.println("Ingrese numero al arreglo");
        arregloEnteros.getNumeros()[contador]= scan.nextInt();
        if (arregloEnteros.getNumeros()[contador]>maximo){
            maximo=arregloEnteros.getNumeros()[contador];
        }else if (arregloEnteros.getNumeros()[contador]< minimo){
            minimo=arregloEnteros.getNumeros()[contador];}
        suma=suma+arregloEnteros.getNumeros()[contador];
        }
        promedio=suma/10;
        System.out.println("el maximo numero es " +maximo);
        System.out.println("el minimo numero es " +minimo);
        System.out.println("el promedio de los numeros es " +promedio);
        arregloEnteros.mostrarArreglo();
    }
    
}
