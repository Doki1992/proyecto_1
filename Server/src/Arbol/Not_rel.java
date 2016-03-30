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
public class Not_rel implements Produccion_rel{
   Produccion_expresion in;

    public Not_rel(Produccion_expresion in) {
        this.in = in;
    }
   
    @Override
    public Object Acept(Visitor v) {
        return  v.vistit(this);
    }
    
}
