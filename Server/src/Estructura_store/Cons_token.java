/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructura_store;

import java.util.LinkedList;

/**
 *
 * @author twa
 */
public class Cons_token extends Token{
    String id;
    String valor;

    public void setId(String id) {
        this.id = id;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public String getValor() {
        return valor;
    }

    public Cons_token(String id, String valor) {
        this.id = id;
        this.valor = valor;
    }
}
