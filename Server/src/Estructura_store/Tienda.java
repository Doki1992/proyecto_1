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
public class Tienda {
    String codigo;
    String propietario;
    String nombre;
    String direccion;
    String telefono;
    String img;
    Tabla_producto productos;

    public Tabla_producto getProductos() {
        return productos;
    }
    
    public Tienda(String codigo, String propietario, String nombre, String direccion, String telefono, String img, Tabla_producto producto) {
        this.codigo = codigo;
        this.propietario = propietario;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.img = img;
        this.productos=producto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getImg() {
        return img;
    }
    
    
    
    
    
}
