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
    Produccion_llamada llamada;
    Produccion_llamada llamada1;

    public Inicio_usuario(Produccion_llamada llamada, Produccion_llamada llamada1) {
        this.llamada = llamada;
        this.llamada1 = llamada1;
    }
    

    @Override
    public Object Acept(Visitor v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
