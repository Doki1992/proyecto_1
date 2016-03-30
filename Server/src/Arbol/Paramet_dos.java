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
public class Paramet_dos implements Produccion_paramet{
    Produccion_paramet paramet;
    Produccion_logica logica;

    public Paramet_dos(Produccion_paramet paramet, Produccion_logica logica) {
        this.paramet = paramet;
        this.logica = logica;
    }
    
    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
