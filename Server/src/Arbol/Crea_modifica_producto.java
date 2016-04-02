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
public class Crea_modifica_producto implements Produccion_c{
public LinkedList<Objeto> list5;
public String operacion ;

    public Crea_modifica_producto(LinkedList<Objeto> list5, String operacion) {
        this.list5 = list5;
        this.operacion = operacion;
    }
    public Crea_modifica_producto(LinkedList<Objeto> list5) {
        this.list5 = list5;
    }

    @Override
    public Object Acept(Visitor v) {
        return  v.vistit(this);
    }
    
}
