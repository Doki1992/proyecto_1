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
public class Registro_tienda implements Produccion_c{
    public LinkedList<Objeto> list2;

    public Registro_tienda(LinkedList<Objeto> list2) {
        this.list2 = list2;
    }
    

    @Override
    public Object Acept(Visitor v) {
        return v.vistit(this);
    }
    
}
