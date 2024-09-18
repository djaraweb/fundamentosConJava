package com.v11.cibertec.capitulo7.laboratorio2;

public class Ejecutora {

    public static void main(String[] args) {

        System.out.println("------------------------ SET --------------------------- ");

        Producto nuevo = new Producto(5,"Pescado",20.65);
        BDProductosSet bdProductosSet = new BDProductosSet();
        System.out.println(bdProductosSet.cuentaElementosBD());
        bdProductosSet.insertarProducto(nuevo);
        System.out.println(bdProductosSet.cuentaElementosBD());

        System.out.println("El producto 5 es =" + bdProductosSet.obtenerProducto(5).toString());
        bdProductosSet.insertarProducto(nuevo);
        System.out.println(bdProductosSet.cuentaElementosBD());

        System.out.println("------------------------ MAP --------------------------- ");
        BDProductosMap bdProductosMap = new BDProductosMap();
        System.out.println(bdProductosMap.cuentaElementosBD());
        bdProductosMap.insertarProducto(nuevo.getCodigo(), nuevo);
        System.out.println(bdProductosMap.cuentaElementosBD());
        System.out.println("El producto 5 es: " + bdProductosMap.obtenerProducto(5).toString());
        bdProductosMap.insertarProducto(nuevo.getCodigo()+1,nuevo );
        System.out.println(bdProductosMap.cuentaElementosBD());

    }
}
