/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructura_store;

import Arbol.*;
import java.util.Enumeration;

/**
 *
 * @author twa
 */
public class Ejecuta_query {
    Tabla_usuario usuarios;
    Funcion_info info;
    Produccion_logica logica;
    Traductor t;
    String nombre_tabla;
    Mate_info mt = new Mate_info();
    

    public Ejecuta_query(Tabla_usuario usuarios, Funcion_info info, Produccion_logica logica, Traductor t, String nombre_tabla) {
        this.usuarios = usuarios;
        this.info = info;
        this.logica = logica;
        this.t = t;
        this.nombre_tabla = nombre_tabla;
    }

    public Ejecuta_query(Tabla_usuario usuarios, Funcion_info info, Produccion_logica logica, Traductor t) {
        this.usuarios = usuarios;
        this.info = info;
        this.logica = logica;
        this.t = t;
    }
    
    public void asigna_consulta_usuarios(Usuario u){
        if(info.containsKey("NOM")){
           info.get_Cons("NOM").setValor(u.nombre);
        }
        if(info.containsKey("TEL")){
           info.get_Cons("TEL").setValor(u.telefono); 
        }
        if(info.containsKey("APE")){
           info.get_Cons("APE").setValor(u.apellido); 
        }
        if(info.containsKey("IDE")){
           info.get_Cons("IDE").setValor(u.id); 
        }
        if(info.containsKey("EMA")){
           info.get_Cons("EMA").setValor(u.email); 
        }
        if(info.containsKey("DIR")){
           info.get_Cons("DIR").setValor(u.direccion); 
        }
    }
    
     public void asigna_consulta_tienda(Tienda u){
        if(info.containsKey("NOM")){
           info.get_Cons("NOM").setValor(u.nombre);
        }
        if(info.containsKey("TEL")){
           info.get_Cons("TEL").setValor(u.telefono); 
        }
        if(info.containsKey("COD")){
           info.get_Cons("COD").setValor(u.codigo); 
        }
        if(info.containsKey("PRO")){
           info.get_Cons("PRO").setValor(u.propietario); 
        }
        if(info.containsKey("DIR")){
           info.get_Cons("DIR").setValor(u.direccion); 
        }
    }
    
    public boolean ejecuta_query(){
        Enumeration claves=usuarios.keys();
        Usuario u;Tienda ti; Producto p;String cla_tienda,cla_pro;
        String c;
        if(nombre_tabla.equals("Usuario")){
            while(claves.hasMoreElements()){
            c=claves.nextElement().toString();
            u=usuarios.get(c);
            asigna_consulta_usuarios(u);  
           boolean a=(boolean)this.logica.Acept(t);
           if(a==true){
               mt.Insertar(c, u);
           }
        }
        }else if(nombre_tabla.equals("Tiendas")){
            while(claves.hasMoreElements()){
            c=claves.nextElement().toString();
            u=usuarios.get(c);  
            Enumeration t = u.getTiendas().keys();
            while(t.hasMoreElements()){
                cla_tienda=t.nextElement().toString();
                ti=usuarios.get(c).getTiendas().get(cla_tienda);
                asigna_consulta_tienda(ti);
                boolean a=(boolean)this.logica.Acept(this.t);
           if(a==true){
               mt.Insertar(c, u);
           }
          }
        }
        }else if(nombre_tabla.equals("Producto")){
            
        }
        
       
        return true;
    }
    
    
}
