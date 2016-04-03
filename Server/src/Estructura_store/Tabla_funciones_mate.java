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
public class Tabla_funciones_mate extends Hashtable<String, Token>{
    String mensaje;

    public String getMensaje(){
        return mensaje;
    }
    
    public void Insertar(String clave, Token token){
        if(!this.containsKey(clave)){
            this.put(clave, token);
        }else{
            mensaje = new String ("El espacio mate con nombre "+clave+" ya existe");
        }
    }
    
    public Mate_token get_Mate(String clave){
        if (this.containsKey(clave)){
            return (Mate_token)this.get(clave);
        }
        return null;
    }
}
