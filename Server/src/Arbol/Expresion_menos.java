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
public class Expresion_menos implements Produccion_expresion{
    Produccion_expresion expresion;
    Produccion_termino termino;

    public Expresion_menos(Produccion_expresion expresion, Produccion_termino termino) {
        this.expresion = expresion;
        this.termino = termino;
    }
    

    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
