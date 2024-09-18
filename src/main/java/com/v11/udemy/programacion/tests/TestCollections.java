package com.v11.udemy.programacion.tests;

import java.util.*;

public class TestCollections {
    public static void main(String[] args) {

        System.out.println("***** ArrayList *****");
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");

        imprimir(miLista);

        System.out.println("***** HashSet *****");
        Set mySet = new HashSet();
        mySet.add("Lunes");
        mySet.add("Martes");
        mySet.add("Miercoles");
        mySet.add("Jueves");
        mySet.add("Viernes");
        mySet.add("Viernes"); // No se puede duplicar
        imprimir(mySet);

        System.out.println("***** HashMap *****");
        Map myMap = new HashMap();
        myMap.put("valor1", "Juan");
        myMap.put("valor2", "Karla");
        myMap.put("valor3", "Rosa");

        String elemento  = (String) myMap.get("valor1");
        System.out.println("elemento = " + elemento);

        imprimir(myMap.keySet());
        imprimir(myMap.values());

    }

    static void imprimir (Collection collection) {
        /*for (var elemento : collection) {
            System.out.println("elemento = " + elemento);
        }*/

        System.out.println("*******");
        collection.forEach(item -> System.out.println("item = " + item));

        /*System.out.println("*******");
        collection.forEach(item -> {
            System.out.println("item = " + item);
        });*/

        System.out.println("======*******=====");
    }


}
