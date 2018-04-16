/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author tito
 */
public class Zapatilla {
    private int talle;
    private boolean original;
    private String marca;

    public Zapatilla() {
    }

    public Zapatilla(int talle, boolean original, String marca) {
        this.talle = talle;
        this.original = original;
        this.marca = marca;
    }

    
    
    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public boolean isOriginal() {
        return original;
    }

    public void setIsOriginal(boolean original) {
        this.original = original;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
