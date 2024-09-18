package com.v11.cibertec.capitulo10.conexion.entities;

public class Producto {
    private int codigoProducto;
    private String nombre;
    private double precio;

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto(){}

    public Producto(int codigoProducto, String nombre, double precio) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("codigoProducto=").append(codigoProducto);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
