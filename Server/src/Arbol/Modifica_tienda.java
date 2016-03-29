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
public class Modifica_tienda implements Produccion_c{
    public LinkedList<Objeto> list3;

    public Modifica_tienda(LinkedList<Objeto> list3) {
        this.list3 = list3;
    }
    

    @Override
    public Object Acept(Visitor v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
