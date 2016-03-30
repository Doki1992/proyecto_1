/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructura_store;

import Arbol.*;
import java.util.LinkedList;

/**
 *
 * @author twa
 */
public class Crea_datos_usuario {
    LinkedList<Objeto> lista;
    String id="null";
    String nombre ="null";
    String apellido ="null";
    String password="null";
    String telefono="null";
    String email="null";
    String direccion="null";
    public Crea_datos_usuario(LinkedList<Objeto> lista){
        this.lista=lista;
    }
    
    public Usuario creaUsuario(){
        for(int i= 0; i<lista.size(); i++){
            if(lista.get(i).getClave().equals("nombre")){
                this.nombre=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("apellido")){
                this.apellido=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("email")){
                this.email=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("id")){
                this.id=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("telefono")){
                this.telefono=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("direccion")){
                this.direccion=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("password")){
                this.password=lista.get(i).getValor();
            }
        }
        
        return new Usuario(id, nombre, apellido, password, telefono, email, direccion, new Tabla_tienda());
    }
}
