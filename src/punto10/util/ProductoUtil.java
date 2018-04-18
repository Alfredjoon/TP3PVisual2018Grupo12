/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto10.util;

import dominio.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alfred
 */
public class ProductoUtil {
    
    ArrayList<Producto> listaProducto =new ArrayList<Producto>();
  
    private int cuota;
    private double total;
    
    
    public void cargaProductos(){
        
       
        listaProducto.add(new Producto(15,"Laptop",3500.00));
        listaProducto.add(new Producto(54,"LCD 32",5000.00));
        listaProducto.add(new Producto(20,"Mouse",200.00));
        listaProducto.add(new Producto(30,"Monitor",15000.00));
        listaProducto.add(new Producto(14,"CPU",35000.00));
        listaProducto.add(new Producto(10,"Mouse Pad",100.00));
        
    
    }
    public void mostrarProductos(){
        
        System.out.println("Codigo "+"\t"+ "Descripcion " +"\t" + "Precio Unitario");
    
        for (Producto producto : listaProducto) {
            System.out.println(producto.getCodigo() + "\t" + producto.getNombre() + "\t" +  "\t"+producto.getPrecioU() );
        }
    
    
    }

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
    
    public void calcularCuotas(){
       
    Scanner scan = new Scanner (System.in);
    
        double precio=0;
        System.out.println("ingrese codigo de producto a comprar ");
        int cod = scan.nextInt();
        boolean band=false;
        int i=0;
        while (band==false && i<listaProducto.size()) {  
            if (listaProducto.get(i).getCodigo()==cod) {
                precio=listaProducto.get(i).getPrecioU();
                System.out.println("CArgando Producto");
                band=true;
            }else
                
                i++;
            
        }
          
          
        
        System.out.println("Ingrese cantidad de cuotas");
        cuota=scan.nextInt();
        
        
        double aux= precio/cuota;
        for( i = 1;i<=cuota;i++){
            System.out.println("Cuota numero "+i + " "+aux);    
        aux = (1.5*aux/100)+aux;
        total += aux;
        }
        }
    
    
    
    }
    

