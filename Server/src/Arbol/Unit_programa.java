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
public class Unit_programa implements Produccion_progrma{
    
    Produccion_pro pro;

    public Unit_programa(Produccion_pro pro) {
        this.pro = pro;
    }
    
    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
