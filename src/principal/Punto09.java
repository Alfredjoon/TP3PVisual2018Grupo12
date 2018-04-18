/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import punto09.util.LibroUtil;

/**
 *
 * @author Alfred
 */
public class Punto09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroUtil unLibro = new LibroUtil();
        unLibro.cargaLibro();
        unLibro.buscarPorTitulo();
    }
    
}
