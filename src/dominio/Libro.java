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
public class Libro {
    private String autor;
    private String titulo;
    private String anio;
    private int categoria;

    public Libro() {
    }

    public Libro(String autor, String titulo, String anio, int categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.anio = anio;
        this.categoria = categoria;
    }

    
    
    
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    
}
