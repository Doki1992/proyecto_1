/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructura_store;

import Arbol.Objeto;
import java.util.Hashtable;
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
    String mensaje;

    public String getMensaje() {
        return mensaje;
    }
    public Crea_datos_tienda(LinkedList<Objeto> lista) {
        this.lista = lista;
    }
    
    public Tienda creaTienda(){
        set_datos();
        Tienda t=new Tienda(codigo, propietario, nombre, direccion, telefono, img, new Tabla_producto());
        reset_datos();
        return  t;
    }
    
    public void modificc_Tienda(Tabla_usuario usuarios){
        set_datos();
        if(usuarios.containsKey(this.propietario)){
            if(usuarios.getUsuario(propietario).tiendas.containsKey(codigo)){
                mensaje = "se han modificado los datos de la tienda con codigo "+codigo;
                Tienda u = usuarios.getUsuario(propietario).tiendas.getTienda(codigo);
                if(!codigo.equals("null"))
                usuarios.getUsuario(propietario).tiendas.getTienda(codigo).setCodigo(codigo);
                if(!nombre.equals("null"))
                usuarios.getUsuario(propietario).tiendas.getTienda(codigo).setNombre(nombre);
                if(!direccion.equals("null"))
                usuarios.getUsuario(propietario).tiendas.getTienda(codigo).setDireccion(direccion);
                if(!propietario.equals("null"))
                usuarios.getUsuario(propietario).tiendas.getTienda(codigo).setPropietario(propietario);
                if(!img.equals("null"))
                usuarios.getUsuario(propietario).tiendas.getTienda(codigo).setImg(img);
                if(!telefono.equals("null"))
                usuarios.getUsuario(propietario).tiendas.getTienda(codigo).setTelefono(telefono);
            }else{
                mensaje="la tienda con codigo "+codigo+" no existe";
            }
        }else{
            mensaje="el usuario con id "+this.propietario+" no existe";
        }
        reset_datos();
    }
    
    private void set_datos(){
        for(int i=0; i<lista.size();i++){
            if(lista.get(i).getClave().equals("codigo")){
                this.codigo=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("Propietario")||lista.get(i).getClave().equals("propietario")){
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
    }
    
    private void reset_datos(){
        codigo=new String("null");
    propietario=new String("null");
    nombre=new String("null");
    direccion=new String("null");
    telefono=new String("null");
    img=new String("null");
    }
    
}
      
    
    

