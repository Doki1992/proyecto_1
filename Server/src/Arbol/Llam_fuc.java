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
public class Llam_fuc implements Produccion_llam{
    Id id;
    Produccion_paramet paramet;

    public Llam_fuc(Id id, Produccion_paramet paramet) {
        this.id = id;
        this.paramet = paramet;
    }
    
    @Override
    public Object Acept(Visitor v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
