/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Alfred
 */
public class Producto {
    
    private int codigo;
    private String nombre; 
    private double precioU;
    

    public Producto(int codigo, String nombre, double precioU) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioU = precioU;
        
    }

    public Producto() {
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(double precioU) {
        this.precioU = precioU;
    }

   
    
    
}
