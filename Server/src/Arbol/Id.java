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
public class Id implements Produccion_factor{
    public String id;

    public Id(String id) {
        this.id = id;
    }
    

    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
