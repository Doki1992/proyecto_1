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
public class List_cuerpo implements Produccion_cuerpo{
    public Produccion_cuerpo cuerpo;
    public Produccion_c c;

    public List_cuerpo(Produccion_cuerpo cuerpo, Produccion_c c) {
        this.cuerpo = cuerpo;
        this.c = c;
    }
    

    @Override
    public Object Acept(Visitor v) {
      return  v.vistit(this);
    }
    
}
