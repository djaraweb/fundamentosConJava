package com.v11.cibertec.capitulo7.teoria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaCadena {

    public static void main(String[] args) {
        List<String> listaCursos = new ArrayList<>();
        listaCursos.add("Java");
        listaCursos.add("Angular");
        listaCursos.add("SQL Server");
        listaCursos.add("PHP");
        listaCursos.add("React");
        // Ordeb ascendente
        Collections.sort(listaCursos);
        System.out.println("listaCursos = " + listaCursos);

        // Orden descendente
        Collections.reverse(listaCursos);
        System.out.println("listaCursos = " + listaCursos);


        System.out.println("***********************************************");
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto(1,"Fideos", 15.36));
        listaProductos.add(new Producto(2,"Detergente", 20.87));
        listaProductos.add(new Producto(3,"Azucar", 1.5));
        listaProductos.add(new Producto(4,"Bolsa Arroz", 5.95));

        Collections.sort(listaProductos);
        for(Producto producto: listaProductos){
            System.out.println(producto);
        }
    }
}
