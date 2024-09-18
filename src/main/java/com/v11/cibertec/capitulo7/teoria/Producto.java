package com.v11.cibertec.capitulo7.teoria;

public class Producto implements Comparable {
    private int codigo;
    private String nombre;
    private double precio;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public Producto(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public int compareTo(Object o) {
        String nombreProducto = ((Producto) o).getNombre();
        return this.nombre.compareTo(nombreProducto);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("codigo=").append(codigo);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
