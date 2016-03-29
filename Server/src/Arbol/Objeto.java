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
public class Objeto {
  String clave;
  Produccion_llamada llamada;
  LinkedList<Objeto> lis;

    public LinkedList<Objeto> getLis() {
        return lis;
    }
  

    public Objeto(String clave, Produccion_llamada llamada, LinkedList<Objeto> lis) {
        this.clave = clave;
        this.llamada = llamada;
        this.lis = lis;
    }

    public Objeto(String clave, Produccion_llamada llamada) {
        this.clave = clave;
        this.llamada = llamada;
    }

    public String getClave() {
        return clave;
    }

    public Produccion_llamada getLlamada() {
        return llamada;
    }
    
}
