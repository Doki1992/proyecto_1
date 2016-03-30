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
public class Expresion_termino implements Produccion_expresion{
   
    Produccion_termino termino;

    public Expresion_termino(Produccion_termino termino) {
        this.termino = termino;
    }

    

    @Override
    public Object Acept(Visitor v) {
      return  v.vistit(this);
    }
    
}
