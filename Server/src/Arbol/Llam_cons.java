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
public class Llam_cons implements Produccion_llam{
    Id id;

    public Llam_cons(Id id) {
        this.id = id;
    }

    
    
    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
