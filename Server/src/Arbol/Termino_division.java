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
public class Termino_division implements Produccion_termino{
    Produccion_termino termino;
    Produccion_factor factor;

    public Termino_division(Produccion_termino termino, Produccion_factor factor) {
        this.termino = termino;
        this.factor = factor;
    }

    @Override
    public Object Acept(Visitor v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
