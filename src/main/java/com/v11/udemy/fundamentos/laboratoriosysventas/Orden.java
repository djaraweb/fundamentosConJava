package com.v11.udemy.fundamentos.laboratoriosysventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos = 0;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el máximo de productos : " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            if (producto != null)
                total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Id Orden: " + this.idOrden);
        System.out.println("Total de la Orden: $" + calcularTotal());
        System.out.println("Productos de la Orden: ");
        for (Producto producto : productos) {
            if (producto != null)
                System.out.println(producto);
        }
    }
}
