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
public class Declara_const implements Produccion_dec{
    public String id;
    public Produccion_logica logica;

    public Declara_const(String id, Produccion_logica logica) {
        this.id = id;
        this.logica = logica;
    }
    

    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
