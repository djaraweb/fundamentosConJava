package com.v11.udemy.fundamentos.laboratoriosysventas;

public class Producto {
    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;
    private Producto(){
        this.idProducto = ++Producto.contadorProducto;
    }

    public Producto(String nombre, double precio) {
        this(); // se inicializa el constructor Producto
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
