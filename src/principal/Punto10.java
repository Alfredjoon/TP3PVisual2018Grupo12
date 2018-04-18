/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import punto10.util.ProductoUtil;

/**
 *
 * @author Alfred
 */
public class Punto10 {

    /**
     * @param args the command line arguments
     */
    
    //Ramon es sin vistas, en consola tenemos que hacer la tabla
    public static void main(String[] args) {
        // TODO code application logic here
        ProductoUtil p = new ProductoUtil();
        p.cargaProductos();
        p.mostrarProductos();
        p.calcularCuotas();
        
    }
    
}
