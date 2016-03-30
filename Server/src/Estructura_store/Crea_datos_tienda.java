/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructura_store;

import Arbol.Objeto;
import java.util.LinkedList;

/**
 *
 * @author twa
 */
public class Crea_datos_tienda {
    String codigo="null";
    String propietario="null";
    String nombre="null";
    String direccion="null";
    String telefono="null";
    String img="null";
    LinkedList<Objeto> lista;

    public Crea_datos_tienda(LinkedList<Objeto> lista) {
        this.lista = lista;
    }
    
    public Tienda creaTienda(){
        for(int i=0; i<lista.size();i++){
            if(lista.get(i).getClave().equals("codigo")){
                this.codigo=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("propietario")){
                this.propietario=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("nombre")){
                this.nombre=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("direccion")){
                this.direccion=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("telefono")){
                this.telefono=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("img")){
                this.img=lista.get(i).getValor();
            }
        }
        return new Tienda(codigo, propietario, nombre, direccion, telefono, img, new Tabla_producto());
    }
}
