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
public class Cadena implements Produccion_factor{
    public String cadena;

    public Cadena(String cadena) {
        this.cadena = cadena;
    }
    

    @Override
    public Object Acept(Visitor v) {
      return  v.vistit(this);
    }
    
}
