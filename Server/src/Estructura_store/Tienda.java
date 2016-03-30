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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setImg(String img) {
        this.img = img;
    }
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
