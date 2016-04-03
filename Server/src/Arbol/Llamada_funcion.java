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
public class Llamada_funcion implements Produccion_llamada{
    Id id;// identificador del espacio mate.
    Produccion_llam llam;

    public Llamada_funcion(Id id, Produccion_llam llam) {
        this.id = id;
        this.llam = llam;
    }
    

    @Override
    public Object Acept(Visitor v) {
        return  v.vistit(this);    }
    
}
