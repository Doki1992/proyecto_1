/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

import java.util.LinkedList;

/**
 *
 * @author twa
 */
public class Crea_producto implements Produccion_c{
public LinkedList<Objeto> list5;

    public Crea_producto(LinkedList<Objeto> list5) {
        this.list5 = list5;
    }

    @Override
    public Object Acept(Visitor v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
