/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructura_store;

import Arbol.Elimina_tienda;
import Arbol.Objeto;
import Arbol.Traductor;
import java.util.LinkedList;

/**
 *
 * @author twa
 */
public class Crea_datos_producto {
    String codigo = "null";
    String nombre= "null";
    String cantidad= "null";
    String marca= "null";
    String color= "null";
    String tamano= "null";
    String img= "null";
    String sucursal= "null";
    String tipo= "null";
    LinkedList<Objeto> lista;
    String mensaje;
    Producto p;
    Traductor t;

    public String getMensaje() {
        return mensaje;
    }
    
    

    public Crea_datos_producto(LinkedList<Objeto> lista, Tabla_usuario usuarios,String tipo, Traductor t) {
        this.lista = lista;
        this.tipo=tipo;
        this.t=t;
        set_datos();
        if(this.tipo.contains("elimin")){
            elmina_producto(usuarios.getTienda(sucursal));
        }else if(this.tipo.contains("modifi")){
            modifica_producto(usuarios.getTienda(sucursal));
        }else{
            crea_producto(usuarios.getTienda(sucursal));
        }
    }
    
    private void set_datos(){
        for (int i = 0; i<lista.size();i++){
            if(lista.get(i).getClave().equals("nombre")){
                this.nombre=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("cantidad")){
                this.cantidad=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("marca")){
                this.marca=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("color")){
                this.color=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("tamaño")){
                this.tamano=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("img")){
                this.img=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("sucursal")){
                this.sucursal=lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("codigo")){
                this.codigo= lista.get(i).getValor();
            }
            if(lista.get(i).getClave().equals("tipo")){
                this.tipo=lista.get(i).getValor();
            }
        }
        
    }
    
    private void reset_datos(){
     codigo = "null";
     nombre= "null";
     cantidad= "null";
     marca= "null";
     color= "null";
     tamano= "null";
     img= "null";
     sucursal= "null";
     tipo= "null";    
        
    }
    
    public Producto crea_producto(Tienda tienda){
        set_datos();
        if(tienda!=null){
            if(!t.claves_producto.containsKey(codigo)){
            tienda.productos.put(codigo, new Producto(codigo,nombre,cantidad,marca,color,tamano,img,sucursal));
            mensaje=new String("Se ha creado el producto con id "+codigo);
            t.claves_producto.put(codigo, codigo);
            }else{
            mensaje=new String("El producto con id "+codigo+" ya existe");    
            }
        }else{
            mensaje=new String("la tienda con id "+sucursal+" no exite");
        }
        reset_datos();
        return null;
    }
    
    public void elmina_producto(Tienda tienda){
        set_datos();
        if(tienda!=null){
          if(tienda.productos.containsKey(codigo)){
          mensaje=new String("Se ha eliminado el producto con id "+codigo);
          tienda.productos.remove(codigo);
          t.claves_producto.remove(codigo);
          }else{
          mensaje=new String("El producto con id "+codigo+" no existe en la tienda  con id "+sucursal);
          }  
        }else{
          mensaje=new String("la tienda con id "+sucursal+" no exite");
        }
        reset_datos();
    }
    
    public void modifica_producto(Tienda tienda){
        set_datos();
        try {
            if(tienda.productos.containsKey(codigo)){
                Producto p =tienda.productos.get(codigo);
            mensaje = new String("Se han modificado los datos del producto con id "+ codigo+" de la tienda con id " +sucursal);
           if(!nombre.equals("null")){
                p.setNombre(nombre);
            }
            if(!cantidad.equals("null")){
                p.setCantidad(cantidad);
            }
            if(!marca.equals("null")){
                p.setMarca(marca);
            }
            if(!color.equals("null")){
                p.setColor(color);
            }
            if(!tamano.equals("null")){
                p.setTamano(tamano);
            }
            if(!img.equals("null")){
                p.setImg(img);
            }
            if(!sucursal.equals("null")){
                p.setSucursal(sucursal);
            }
            if(!codigo.equals("null")){
                p.setCodigo(codigo);
            }
            
            }else{
            mensaje= new String ("El producto con id "+codigo+" no existe");
        }
        } catch (Exception e) {
            mensaje=new String("la tienda con el id "+sucursal+" no existe");
        }
        reset_datos();
    }
 
}
