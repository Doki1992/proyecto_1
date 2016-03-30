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
public class Inicio_usuario implements Produccion_c{
    String llamada;
    String llamada1;

    public Inicio_usuario(String llamada, String llamada1) {
        this.llamada = llamada;
        this.llamada1 = llamada1;
    }
    

    @Override
    public Object Acept(Visitor v) {
       return  v.vistit(this);
    }
    
}
