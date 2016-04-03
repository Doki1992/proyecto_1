/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructura_store;

import Arbol.Traductor;
import java.util.LinkedList;

/**
 *
 * @author twa
 */
public class Ejecuta_llamada {

    LinkedList<String> paramet;//estos son los valores
    int size;//este es el tamaño de los parametros
    Funcion_token ft;//esta la tabla de simbolos para esta funcion
    Traductor t;//recorre el arbol de la expresion aritmetica
    String mensaje;

    public String getMensaje() {
        return mensaje;
    }
    
    public Ejecuta_llamada(LinkedList<String> paramet, int size, Funcion_token ft,Traductor t) {
        this.paramet = paramet;
        this.size = size;
        this.ft = ft;
        this.t=t;
    }
    
       public void asigna_valores(LinkedList<String> parametros){
        for(int i =0; i<parametros.size(); i++){
            ft.getParat().Insertar(parametros.get(i), new Cons_token(parametros.get(i), paramet.get(i)));
        }
    }
       public String ejecuta_llamada(){
           if(ft.numero_parametros==size){
               return ft.expresion.Acept(this.t).toString();
           }else{
               mensaje = "El numero de parametros no es correcto";
           }
           return null;
       }
    
    
}
