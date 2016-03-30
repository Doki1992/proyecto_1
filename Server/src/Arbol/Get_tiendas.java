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
public class Get_tiendas implements Produccion_c{
    Produccion_llamada llamada1;
    Produccion_llamada llamada2;

    public Get_tiendas(Produccion_llamada llamada1, Produccion_llamada llamada2) {
        this.llamada1 = llamada1;
        this.llamada2 = llamada2;
    }
    

    @Override
    public Object Acept(Visitor v) {
        return  v.vistit(this);
    }
    
}
