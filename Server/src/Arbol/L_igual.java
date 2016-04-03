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
public class L_igual implements Produccion_rel{
    
    Produccion_expresion in;
    Produccion_rel rel;

    public L_igual(Produccion_rel rel, Produccion_expresion in) {
        this.in = in;
        this.rel = rel;
    }
    @Override
    public Object Acept(Visitor v) {
        return v.vistit(this);
    }
    
}
