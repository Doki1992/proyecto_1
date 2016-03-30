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
public class Unit_declara implements Produccion_declara{
    Produccion_dec dec;

    public Unit_declara(Produccion_dec dec) {
        this.dec = dec;
    }
    
    @Override
    public Object Acept(Visitor v) {
        return  v.vistit(this);
    }
    
}
