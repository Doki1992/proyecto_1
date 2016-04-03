/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructura_store;

import java.util.LinkedList;
import Arbol.*;

/**
 *
 * @author twa
 */
public class Funcion_token extends Token{
    String id;
    Produccion_expresion expresion;
    LinkedList<String> parametros;
    int numero_parametros;
    Funcion_info parat=new Funcion_info();

    public Funcion_info getParat() {
        return parat;
    }

    public String getId() {
        return id;
    }

    public Produccion_expresion getExpresion() {
        return expresion;
    }

    public LinkedList<String> getParametros() {
        return parametros;
    }

    public int getNumero_parametros() {
        return numero_parametros;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setExpresion(Produccion_expresion expresion) {
        this.expresion = expresion;
    }

    public void setParametros(LinkedList<String> parametros) {
        this.parametros = parametros;
    }

    public void setNumero_parametros(int numero_parametros) {
        this.numero_parametros = numero_parametros;
    }
    
    public Funcion_token(String id, Produccion_expresion expresion, LinkedList<String> parametros, int numero_parametros) {
        this.id = id;
        this.expresion = expresion;
        this.parametros = parametros;
        this.numero_parametros = numero_parametros;
    }
    
 
}
