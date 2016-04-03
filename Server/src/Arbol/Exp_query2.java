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
public class Exp_query2 implements Produccion_exp{
    public String logica1;
    public Produccion_logica logica2;
    public Funcion_info info; 

    public Exp_query2(String logica1, Produccion_logica logica2, Funcion_info info) {
        this.logica1= logica1;
        this.logica2 = logica2;
        this.info = info;
    }

    public Exp_query2(String logica1, Produccion_logica logica2) {
        this.logica1 = logica1;
        this.logica2 = logica2;
    }
    

    @Override
    public Object Acept(Visitor v) {
      return  v.vistit(this);
    }
    
}
