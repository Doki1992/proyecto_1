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
public class Tabla_tienda extends Hashtable<String, Tienda>{
    String mensaje;

    public String getMensaje() {
        return mensaje;
    }
    
    public void insertar(String clave, Tienda t){
        if(!this.contains(clave)){
            this.put(clave, t);
        }else{
            mensaje="Esta tienda  ya existe";
        }
    }
    
    public Tienda getTienda(String clave){
        return this.get(clave);
    }
    
}
