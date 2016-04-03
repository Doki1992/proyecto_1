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
public class Mate_info extends Hashtable<String, Token> {
    String mensaje;

    public String getMensaje(){
        return mensaje;
    }
    
    public void Insertar(String clave, Token token){
        if(!this.containsKey(clave)){
            this.put(clave, token);
        }else{
            mensaje = new String ("La variable o metodo con id "+clave+" ya existe");
        }
    }
    
    public Funcion_token get_Funcion(String clave){
        if(this.containsKey(clave)){
            return (Funcion_token)this.get(clave);
        }
        return null;
    }
    
    public Cons_token get_Cons(String clave){
        if(this.containsKey(clave)){
            return (Cons_token)this.get(clave);
        }
        return null;
    }
}
