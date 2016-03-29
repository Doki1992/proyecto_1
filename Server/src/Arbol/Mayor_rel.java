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
public class Mayor_rel implements Produccion_rel{
   public Produccion_rel rel;
    public Produccion_expresion in;

    public Mayor_rel(Produccion_rel rel, Produccion_expresion in) {
        this.rel = rel;
        this.in = in;
    }

    @Override
    public Object Acept(Visitor v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
