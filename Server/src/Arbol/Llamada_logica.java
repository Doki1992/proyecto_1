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
public class Llamada_logica implements Produccion_llamada{
    Produccion_logica logica;

    public Llamada_logica(Produccion_logica logica) {
        this.logica = logica;
    }
    
    
    @Override
    public Object Acept(Visitor v) {
      return  v.vistit(this);
    }
    
}
