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
public class Usuario extends Token{
    String id;
    String nombre;
    String apellido;
    String password;
    String telefono;
    String email;
    String direccion;
    Tabla_tienda tiendas;

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTiendas(Tabla_tienda tiendas) {
        this.tiendas = tiendas;
    }
    

    public Usuario(String id, String nombre, String apellido, String password, String telefono, String email, String direccion,Tabla_tienda tiendas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.tiendas=tiendas;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPassword() {
        return password;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Tabla_tienda getTiendas() {
        return tiendas;
    }

    public String getDireccion() {
        return direccion;
    }
    
    
}
