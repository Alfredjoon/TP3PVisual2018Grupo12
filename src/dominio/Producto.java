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
    private float precioU;
    private int cuotas;

    public Producto(int codigo, String nombre, float precioU, int cuotas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioU = precioU;
        this.cuotas = cuotas;
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

    public void setPrecioU(float precioU) {
        this.precioU = precioU;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }
    
    
}
