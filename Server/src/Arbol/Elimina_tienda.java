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
public class Elimina_tienda implements Produccion_c{
    public LinkedList<Objeto> list4;

    public Elimina_tienda(LinkedList<Objeto> list4) {
        this.list4 = list4;
    }
    

    @Override
    public Object Acept(Visitor v) {
      return  v.vistit(this);
    }
    
}
