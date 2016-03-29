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
public class Mate implements Produccion_pro{
    
    Produccion_declara declara;
    Produccion_logica logica;

    public Mate(Produccion_declara declara, Produccion_logica logica) {
        this.declara = declara;
        this.logica = logica;
    }

    @Override
    public Object Acept(Visitor v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
