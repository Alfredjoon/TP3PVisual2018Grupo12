/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto09.util;

import java.util.ArrayList;
import java.util.Scanner;
import punto08.dominio.Libro;

/**
 *
 * @author Alfred
 */
public class LibroUtil {
    
    ArrayList<Libro> listaLibros = new  ArrayList<>();
    Scanner scan = new Scanner (System.in);
    
    
    public void cargaLibro (){
    
        listaLibros.add(new Libro("George Orwell","Rebelion en la Granja" , "1945",5));
        listaLibros.add(new Libro("Jorge Luis Borges","Las Ruinas Circulares" , "1947",3));
        listaLibros.add(new Libro("Ernesto Sabato","El tunel" , "1948",2));
        listaLibros.add(new Libro("Ernesto Sabato","uno y el universo" , "1945",4));
        listaLibros.add(new Libro("Jorge Luis Borges","La biblioteca de babel" , "1941",5));
        listaLibros.add(new Libro("Jorge Luis Borges","Borges y yo" , "1960",1));
        listaLibros.add(new Libro("Jorge Luis Borges","Borges y yo" , "1960",1));
    
    
    }
    public void buscarPorTitulo(){
        
        
        
        System.out.println("Ingrese Titulo de Libro (sin espacios)");
        String aux = scan.next();
        int count=0;
        for (Libro l : listaLibros) {
                if(l.getTitulo().trim().replace(" ","").toUpperCase().equals(aux.toUpperCase())){
                      
                            System.out.println(l.getISBM()+"\t" +  l.getTitulo() + "\t"+ l.getAutor() + "\t" + l.getPrecio() );
                           
        }
    }
    }
}

