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
public class Mate implements Produccion_pro{
    
    Produccion_declara declara;
    String id;

    public Mate(Produccion_declara declara, String id) {
        this.declara = declara;
        this.id = id;
    }

    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
