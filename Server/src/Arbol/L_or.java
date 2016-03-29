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
public class L_or implements Produccion_logica{
    Produccion_logica logica;
    Produccion_rel rel;

    public L_or(Produccion_logica logica, Produccion_rel rel) {
        this.logica = logica;
        this.rel = rel;
    }

    @Override
    public Object Acept(Visitor v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
