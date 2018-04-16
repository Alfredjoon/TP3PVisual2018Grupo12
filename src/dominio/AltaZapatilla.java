/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.Scanner;

/**
 *
 * @author tito
 */
public class AltaZapatilla {
    private Zapatilla[] zapatillas;
    private Scanner sc = new Scanner(System.in);
    
    public void iniciar(){
        System.out.println("Cantidad de Zapatillas a Ingresar"); 
        CargarZapatilla(sc.nextInt());
        mostrarZapatillas();
    }
    
    public void CargarZapatilla(int Cantidad){
        zapatillas = new Zapatilla[Cantidad];
        for (int i = 0; i < zapatillas.length; i++) {
             zapatillas[i] = crearZapatilla();
             if(i+1 < zapatillas.length){
                 System.out.println("\nIngrese Otra Zapatilla\n------------------------------------");
             }else{
                 System.out.println("\n--------------------------------------------\nCarga Completa");
             }
        }
    }
    
    public Zapatilla crearZapatilla(){
        Zapatilla unaZapatilla = new Zapatilla(
                pedirTalle(),
                esOriginal(),
                pedirMarca());
        return unaZapatilla;
    }
    
    public int pedirTalle(){
        System.out.println("Ingrese Numero de Talle");
        return sc.nextInt();
    }

    public boolean  esOriginal(){
        String aux;
        System.out.println("Es original?");
        aux = sc.next();
        if ("Si".equals(aux) || "S".equals(aux) || "s".equals(aux) || "si".equals(aux) || "SI".equals(aux) || "sI".equals(aux) ) {
            return true;
        }else{
            return false;
        }        
    }
    
    public String pedirMarca(){
        System.out.println("Ingrese Marca de Zapatilla");
        return sc.next();
    }
    
    
    public void mostrarZapatillas(){
        if(zapatillas.length > 0){
            for (Zapatilla z : zapatillas) {
                System.out.println("\n----------------------------------------------------------------------------------");
                System.out.println("Marca: " + z.getMarca() +"\nNumero: "+ z.getTalle() + "\nOriginal: "+ (z.isOriginal() ? "SI" : "NO"));
            }            
        }else{
            System.out.println("Lista Vacia");
        }
    }
    
    public Zapatilla[] getZapatillas() {
        return zapatillas;
    }
    
    public void setZapatillas(Zapatilla[] zapatillas) {
        this.zapatillas = zapatillas;
    }
    
    
}
