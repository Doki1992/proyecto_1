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
public class Query implements Produccion_pro{
    Produccion_exp exp;

    public Query(Produccion_exp exp) {
        this.exp = exp;
    }


    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
