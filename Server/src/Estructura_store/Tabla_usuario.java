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
public class Tabla_usuario extends Hashtable<String, Usuario>{
    String mensaje;

    public String getMensaje() {
        return mensaje;
    }
    
    public void isnertar(String clave, Usuario u){
        if(!this.contains(clave)){
            this.put(clave, u);
        }else{
            mensaje="Este usuario ya existe" +" "+ u.getId();
        }
    }
    
    public Usuario getUsuario(String clave){
        return this.get(clave);
    }
    
    
}
