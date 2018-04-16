/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tito
 */
public class PrincipalLibro {
    
    ArrayList<Categoria> listCategorias;
    ArrayList<Libro> listLibros;
    Scanner sc = new Scanner(System.in);
    public void iniciar() {
        cargarCategorias();
        cargarLibros();
        mostrarLibros();
        int op;
        do {			
            System.out.println("\n-----Menu------");
            System.out.println("Elegir Opcion");
            System.out.println("1 - Buscar por Autor");
            System.out.println("2 - Buscar por Titulo");
            System.out.println("3 - Buscar por Categoria");
            System.out.println("4 - Buscar por Titulo y Categoria");
            System.out.println("5 - Salir");
            op = sc.nextInt();
            switch (op) {
		case 1: 
                    buscarPorAutor();
                    break;			
		case 2: 
                    buscarPorTitulo();
                    break;
                case 3:    
		    buscarPorCategoria();
                    break;
                case 4:
                    buscarPorAmbos();
                    break;
		default:
                    System.out.println("------Fin-------");
                    break;
            }
			
	} while (op!=5);
    }
    
    public void cargarCategorias(){
        listCategorias = new ArrayList<>();
        listCategorias.add(new Categoria(1, "Accion"));
        listCategorias.add(new Categoria(2, "Aventura"));
        listCategorias.add(new Categoria(3, "Terror"));
        listCategorias.add(new Categoria(4, "Ciencia Ficcion"));
        listCategorias.add(new Categoria(5, "Satira"));
    }
    
    public void cargarLibros(){
        listLibros = new ArrayList<>();
        listLibros.add(new Libro("George Orwell","Rebelion en la Granja" , "1945",5));
        listLibros.add(new Libro("Jorge Luis Borges","Las Ruinas Circulares" , "1947",3));
        listLibros.add(new Libro("Ernesto Sabato","El tunel" , "1948",2));
        listLibros.add(new Libro("Ernesto Sabato","uno y el universo" , "1945",4));
        listLibros.add(new Libro("Jorge Luis Borges","La biblioteca de babel" , "1941",5));
        listLibros.add(new Libro("Jorge Luis Borges","Borges y yo" , "1960",1));
        listLibros.add(new Libro("Jorge Luis Borges","Borges y yo" , "1960",1));
    }
    
    public void mostrarCategorias(){
        for (Categoria c : listCategorias) {
            System.out.println(c.getIdCategoria() +" - "+ c.getNombre());
        }        
        System.out.println("-------------------------\n");
    }
    
    public void mostrarLibros(){
            for (Libro l : listLibros) {
                for (Categoria c : listCategorias) {        
                    if(l.getCategoria() == c.getIdCategoria()){
                    System.out.println("\n-------------------------------\n"+l.getAutor() + "\n" + l.getTitulo() + "\n" + l.getAnio() + "\n" +
                        (l.getCategoria() == c.getIdCategoria()  ? c.getNombre() : ""));
                    }
                }
            }
    }
    
    public void buscarPorAutor(){
        System.out.println("Ingrese Nombre de Autor (Sin espacios)");
        String aux = sc.next();
        int count =0;
        for (Libro l : listLibros) {            
                if(l.getAutor().toUpperCase().trim().replace(" ","").equals(aux.toUpperCase())){
                    for (Categoria c : listCategorias) {            
                        if(l.getCategoria() == c.getIdCategoria()){    
                            System.out.println("\n-------------------------------\n"+l.getAutor() + "\n" + l.getTitulo() + "\n" + l.getAnio() + "\n" +
                            (l.getCategoria() == c.getIdCategoria()  ? c.getNombre() : "-----------"));
                        }
                    }
                    count++;
                }
        }
        
        if(count == 0){
             System.out.println("No hay coincidencia");
        }
    }
    
    public void buscarPorTitulo(){
        System.out.println("Ingrese Titulo de Libro (sin espacios)");
        String aux = sc.next();
        int count=0;
        for (Libro l : listLibros) {
                if(l.getTitulo().trim().replace(" ","").toUpperCase().equals(aux.toUpperCase())){
                    for (Categoria c : listCategorias) {            
                        if(l.getCategoria() == c.getIdCategoria()){    
                            System.out.println("\n-------------------------------\n"+l.getAutor() + "\n" + l.getTitulo() + "\n" + l.getAnio() + "\n" +
                            (l.getCategoria() == c.getIdCategoria()  ? c.getNombre() : "-----------"));
                        }
                    }
                    count++;
                }
        }
        
        if(count == 0){
            System.out.println("No hay coincidencia");
        }    
    }
    
    public void buscarPorCategoria(){
        mostrarCategorias();
        System.out.println("Elegir categoria");
        int aux = sc.nextInt();
        int count=0;
            for (Libro l : listLibros) {                
                if(l.getCategoria() == aux){    
                   for (Categoria c : listCategorias) {            
                        if(l.getCategoria() == c.getIdCategoria()){    
                            System.out.println("\n-------------------------------\n"+l.getAutor() + "\n" + l.getTitulo() + "\n" + l.getAnio() + "\n" +
                            (l.getCategoria() == c.getIdCategoria()  ? c.getNombre() : "-----------"));
                            
                        }
                    }
                   count++;
                }         
            }
        if(count == 0){
            System.out.println("No hay coincidencia");
        }    
    }
    
    public void buscarPorAmbos(){
          mostrarCategorias();
          System.out.println("Elegir categoria");
          int cat = sc.nextInt();
          System.out.println("Ingrese Titulo (sin espacios)");
          String tit = sc.next();
          
          int count=0;
             for (Libro l : listLibros) {                
                if(l.getTitulo().trim().replace(" ","").toUpperCase().equals(tit.toUpperCase())&& l.getCategoria() == cat){
                    for (Categoria c : listCategorias) {            
                        if(l.getCategoria() == c.getIdCategoria()){    
                            System.out.println("\n-------------------------------\n"+l.getAutor() + "\n" + l.getTitulo() + "\n" + l.getAnio() + "\n" +
                            (l.getCategoria() == c.getIdCategoria()  ? c.getNombre() : "-----------"));
                        }
                    }
                    count++;
                }                
        }
        
        if(count == 0){
            System.out.println("No hay coincidencia");
        }    
          
    }
}
