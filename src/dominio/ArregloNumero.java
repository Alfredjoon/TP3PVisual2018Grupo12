/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Scanner;

/**
 *
 * @author Alfred
 */
public class ArregloNumero {
    
    private int[] numero;

    public int[] getNumero() {
        return numero;
    }

    public void setNumero(int[] numero) {
        this.numero = numero;
    }

    public ArregloNumero(int tamanio) {
        numero = new int[tamanio];
    }
    
    public void mostrarMenorMayorPromedio(){
    
     Scanner scan = new Scanner (System.in);
        
        int maximo=0;
        int minimo=0;
        int suma=0;
        int promedio;
       
        for (int i = 0 ; i<numero.length;i++){
        System.out.println("Ingrese numero al arreglo");
        numero[i]= scan.nextInt();
        if (numero[i]>maximo){
            maximo=numero[i];
            minimo=numero[i];
        }else if (numero[i]< minimo)
            minimo=numero[i];
        suma=suma+numero[i];
        }
        promedio=suma/10;
        System.out.println("el maximo numero es " +maximo);
        System.out.println("el minimo numero es " +minimo);
        System.out.println("el promedio de los numeros es " +promedio);
        }
    
    }
    
    

