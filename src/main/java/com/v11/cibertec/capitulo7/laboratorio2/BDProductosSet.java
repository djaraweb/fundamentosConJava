package com.v11.cibertec.capitulo7.laboratorio2;

import java.util.HashSet;
import java.util.Set;

public class BDProductosSet {
    static Set<Producto> base;
    static {
        base = new HashSet<>();
        base.add(new Producto(1,"Fideos", 15.23));
        base.add(new Producto(2,"Azucar", 20.50));
        base.add(new Producto(3,"Galletas", 1.30));
        base.add(new Producto(4,"Pollo", 5.8));
    }

    void insertarProducto(Producto producto){
        base.add(producto);
        System.out.println("Se agrego !!");
    }

    Producto obtenerProducto(int codigo){
        for (Producto producto: base){
            if(producto.getCodigo()== codigo)
                return producto;
        }
        return null;
    }

    int cuentaElementosBD(){
        return base.size();
    }
}
