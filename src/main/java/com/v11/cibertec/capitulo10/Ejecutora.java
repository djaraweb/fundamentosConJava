package com.v11.cibertec.capitulo10;


import com.v11.cibertec.capitulo10.conexion.dao.ProductoDAO;
import com.v11.cibertec.capitulo10.conexion.entities.Producto;
import java.util.List;

public class Ejecutora {

    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        System.out.println("***** Trabajando con Base Datos Mysql *****");
        System.out.println("-----------------------------------------------");

        ProductoDAO pdao = new ProductoDAO();
        List<Producto> lista = pdao.obtieneProductos();
        lista.stream().forEach(System.out::println);

        System.out.println("*****************************************************");
        System.out.println("Creando elemento 10");

        System.out.println("Insertando Producto");
        Producto producto = new Producto(10, "Monitor", 564);
        pdao.insertar(producto);

        System.out.println("*****************************************************");
        System.out.println("Listando las Productos despues de agregar elemento 10");
        lista = pdao.obtieneProductos();
        lista.stream().forEach(System.out::println);

        System.out.println("*****************************************************");
        System.out.println("Insertando otra Producto sin codigo");
        Producto otroProducto = new Producto();
        otroProducto.setNombre("CPU");
        otroProducto.setPrecio(950.5);
        pdao.insertarSinCodigo(otroProducto);
        System.out.println("*****************************************************");
        System.out.println("Listando los productos despues de agregar sin codigo");
        lista = pdao.obtieneProductos();
        lista.stream().forEach(System.out::println);

        System.out.println("*****************************************************");

        System.out.println("Obteniendo Producto con codigo 10");
        Producto producto2 = pdao.obtenerProducto(10);
        System.out.println("Producto: " + producto2);

        System.out.println("*****************************************************");
        System.out.println("Actualizando elemento 10");

        Producto productoNuevo = new Producto(10, "Licuadora", 1548);
        pdao.actualizarProducto(productoNuevo);
        System.out.println("*****************************************************");
        System.out.println("Lista actualizada");
        lista = pdao.obtieneProductos();
        lista.stream().forEach(System.out::println);
        System.out.println("*****************************************************");
        System.out.println("Eliminando Producto 10");
        pdao.eliminarProducto(producto);
        lista = pdao.obtieneProductos();
        lista.stream().forEach(System.out::println);

    }
}
