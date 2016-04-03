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
public class Llam_fuc implements Produccion_llam{
    Id id;
    LinkedList<String> paramet;

    public Llam_fuc(Id id, LinkedList<String> paramet) {
        this.id = id;
        this.paramet = paramet;
    }
    
    @Override
    public Object Acept(Visitor v) {
        return  v.vistit(this);
    }
    
}
