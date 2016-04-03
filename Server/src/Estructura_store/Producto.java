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
public class Producto extends Token{
    String codigo;
    String nombre;
    String cantidad;
    String marca;
    String color;
    String tamano;
    String img;
    String sucursal;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public Producto(String codigo, String nombre, String cantidad, String marca, String color, String tamano, String img, String sucursal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.marca = marca;
        this.color = color;
        this.tamano = tamano;
        this.img = img;
        this.sucursal = sucursal;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getTamano() {
        return tamano;
    }

    public String getImg() {
        return img;
    }

    public String getSucursal() {
        return sucursal;
    }
    
    
}
