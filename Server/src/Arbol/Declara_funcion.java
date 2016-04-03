/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arbol;

import java.util.LinkedList;

/**
 *
 * @author twa
 */
public class Declara_funcion implements Produccion_dec{
    public String id;
    public Produccion_expresion expresion;
    public LinkedList<String> paramet;

    public Declara_funcion(String id, Produccion_expresion expresion, LinkedList<String> paramet) {
        this.id = id;
        this.expresion = expresion;
        this.paramet = paramet;
    }
    

    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
