/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructura_store;

import java.util.Hashtable;

/**
 *
 * @author twa
 */
public class Funcion_info extends Hashtable<String, Token>{
    
    public void Insertar(String clave, Cons_token ct){
    if (!this.containsKey(clave))    {
        this.put(clave, ct);
    }
    }
    
       public Cons_token get_Cons(String clave){
        if(this.containsKey(clave)){
            return (Cons_token)this.get(clave);
        }
        return null;
    }
}
