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
public class L_xor implements Produccion_logica{

     Produccion_logica logica;
    Produccion_rel rel;

    public L_xor(Produccion_logica logica, Produccion_rel rel) {
        this.logica = logica;
        this.rel = rel;
    }

    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
