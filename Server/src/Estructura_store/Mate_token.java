/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Estructura_store;

/**
 *
 * @author twa
 */
public class Mate_token extends Token{
    Mate_info variables;
    String id;

    public Mate_token(Mate_info variables, String id) {
        this.variables = variables;
        this.id = id;
    }

    public Mate_info getVariables() {
        return variables;
    }

    public String getId() {
        return id;
    }

    public void setVariables(Mate_info variables) {
        this.variables = variables;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
