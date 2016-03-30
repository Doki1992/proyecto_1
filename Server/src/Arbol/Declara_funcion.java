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
public class Declara_funcion implements Produccion_dec{
    public String id;
    public Produccion_logica logica;
    public Produccion_paramet paramet;

    public Declara_funcion(String id, Produccion_logica logica, Produccion_paramet paramet) {
        this.id = id;
        this.logica = logica;
        this.paramet = paramet;
    }
    

    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
