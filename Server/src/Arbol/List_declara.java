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
public class List_declara implements Produccion_declara{
Produccion_declara declara;
Produccion_dec dec;

    public List_declara(Produccion_declara declara, Produccion_dec dec) {
        this.declara = declara;
        this.dec = dec;
    }

    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
