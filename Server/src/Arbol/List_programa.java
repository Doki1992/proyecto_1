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
public class List_programa implements Produccion_progrma{
    Produccion_pro pro;
    Produccion_progrma programa;

    public List_programa(Produccion_pro pro, Produccion_progrma programa) {
        this.pro = pro;
        this.programa = programa;
    }

    @Override
    public Object Acept(Visitor v) {
        return  v.vistit(this);
    }
    
}
