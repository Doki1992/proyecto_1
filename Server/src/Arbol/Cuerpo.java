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
public class Cuerpo implements Produccion_pro{
    
    Produccion_cuerpo cuerpo;

    public Cuerpo(Produccion_cuerpo cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public Object Acept(Visitor v) {
        return  v.vistit(this);
    }
    
}
