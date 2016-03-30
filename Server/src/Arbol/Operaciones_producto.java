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
public class Operaciones_producto implements Produccion_c{
public LinkedList<Objeto> list6;

    public Operaciones_producto(LinkedList<Objeto> list6) {
        this.list6 = list6;
    }

    @Override
    public Object Acept(Visitor v) {
      return  v.vistit(this);
    }
    
}
