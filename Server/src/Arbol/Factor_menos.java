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
public class Factor_menos implements Produccion_factor{
    public Produccion_expresion expresion;

    public Factor_menos(Produccion_expresion expresion) {
        this.expresion = expresion;
    }
    

    @Override
    public Object Acept(Visitor v) {
        return  v.vistit(this);
    }
    
}
