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
public class Numero implements Produccion_factor{
    public String numero;

    public Numero(String numero) {
        this.numero = numero;
    }
    

    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
