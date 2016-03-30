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
public class Exp_query2 implements Produccion_exp{
    public Produccion_logica logica1;
    public Produccion_logica logica2;

    public Exp_query2(Produccion_logica logica1, Produccion_logica logica2) {
        this.logica1 = logica1;
        this.logica2 = logica2;
    }
    

    @Override
    public Object Acept(Visitor v) {
      return  v.vistit(this);
    }
    
}
