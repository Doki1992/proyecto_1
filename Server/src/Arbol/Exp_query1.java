/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

import Estructura_store.Funcion_info;

/**
 *
 * @author twa
 */
public class Exp_query1 implements Produccion_exp{

    public Produccion_logica logica;
    public Funcion_info info;

    public Exp_query1(Produccion_logica logica, Funcion_info info) {
        this.logica = logica;
        this.info = info;
    }

    public Exp_query1(Produccion_logica logica) {
        this.logica = logica;
    }
    @Override
    public Object Acept(Visitor v) {
      return  v.vistit(this);
    }
    
}
