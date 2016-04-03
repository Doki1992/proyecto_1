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
public class Declara_const implements Produccion_dec{
    public String id;
    public String  valor;

    public Declara_const(String id, String valor) {
        this.id = id;
        this.valor = valor;
    }
    

    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
