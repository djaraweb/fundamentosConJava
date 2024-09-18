package com.v11.cibertec.capitulo7.laboratorio2;

import java.util.HashMap;
import java.util.Map;

public class BDProductosMap {
    static Map<Integer,Producto> base;
    static {
        base = new HashMap<>();
        base.put(1,new Producto(1,"Fideos", 15.23));
        base.put(2,new Producto(2,"Azucar", 20.50));
        base.put(3,new Producto(3,"Galletas", 1.30));
        base.put(4,new Producto(4,"Pollo", 5.8));
    }

    void insertarProducto(int codigo, Producto producto){
        base.put(codigo,producto);
        System.out.println("Se agrego !!");
    }

    Producto obtenerProducto(int codigo){
        return base.get(codigo);
    }

    int cuentaElementosBD(){
        return base.size();
    }

}
