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
public class Tabla_producto extends Hashtable<String, Producto>{
    String mensaje;
    public Tabla_producto(){
        
    }

    public String getMensaje() {
        return mensaje;
    }
    
    public void insertar(String clave, Producto p){
        if(!this.containsKey(clave)){
        this.put(clave, p);
        }else{
            mensaje="Este producto ya existe";
        }
    }
    
    public Producto getProducto(String clave){
        return this.get(clave);
    }
}
