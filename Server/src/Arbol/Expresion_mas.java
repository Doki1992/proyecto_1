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
public class Expresion_mas implements Produccion_expresion{
    Produccion_expresion expresion;
    Produccion_termino termino;

    public Expresion_mas(Produccion_expresion expresion, Produccion_termino termino) {
        this.expresion = expresion;
        this.termino = termino;
    }

    @Override
    public Object Acept(Visitor v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
