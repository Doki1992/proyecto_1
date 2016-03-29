/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

/**
 *
 * @author twa
 */
public class Llamada_funcion implements Produccion_llamada{
    Produccion_logica logica;
    Produccion_llam llam;

    public Llamada_funcion(Produccion_logica logica, Produccion_llam llam) {
        this.logica = logica;
        this.llam = llam;
    }
    

    @Override
    public Object Acept(Visitor v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
