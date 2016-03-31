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
    String tipo="null";
    Tienda t;

    public Tienda getT() {
        return t;
    }
    LinkedList<Objeto> lista;
    String mensaje;

    public String getMensaje() {
        return mensaje;
    }
    public Crea_datos_tienda(LinkedList<Objeto> lista,Tabla_usuario usuarios) {
        this.lista = lista;
        set_datos();
        if(tipo.contains("elimi")){
            elimina_Tienda(usuarios);
        }else if(tipo.contains("modifi")){
            modificc_Tienda(usuarios);
        }else{
            creaTienda();
        }
    }
    
    public Tienda creaTienda(){
        set_datos();
        t=new Tienda(codigo, propietario, nombre, direccion, telefono, img, new Tabla_producto());
        reset_datos();
        return  t;
    }
    
    public void elimina_Tienda(Tabla_usuario usuarios){
        set_datos();
        if(usuarios.containsKey(propietario)){
            if(usuarios.getUsuario(propietario).tiendas.containsKey(codigo)){
                Tabla_tienda t =usuarios.getUsuario(propietario).tiendas;
                t.remove(codigo);
            mensaje=new String("La tienda con id "+codigo+" ha sido eliminada");
            }else{
            mensaje = new String("La Tienda con id " +codigo+" no existe");
            }
        }else{
            mensaje = new String("El usuario con id " +propietario+" no existe");
        }
        reset_datos();
    }
    
    public void modificc_Tienda(Tabla_usuario usuarios){
        set_datos();
        if(usuarios.containsKey(this.propietario)){
            if(usuarios.getUsuario(propietario).tiendas.containsKey(codigo)){
                mensaje = new String("se han modificado los datos de la tienda con codigo "+codigo);
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
                mensaje=new String("la tienda con codigo "+codigo+" no existe");
            }
        }else{
            mensaje=new String("el usuario con id "+this.propietario+" no existe");
        }
        reset_datos();
    }
    
    public void elimina_tienda(Tabla_usuario usuarios){
        if(usuarios.containsKey(propietario)){
            if(usuarios.getUsuario(propietario).tiendas.containsKey(codigo)){
              usuarios.getUsuario(propietario).tiendas.remove(codigo);
            }else{
            mensaje = new String("la tienda no existe");
            }
        }else{
            mensaje = new String("el usuario no existe");
        }
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
            if(lista.get(i).getClave().equals("tipo")){
                this.tipo=lista.get(i).getValor();
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
    tipo=new String("null");
    }
    
}
      
    
    

