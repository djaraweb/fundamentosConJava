package com.v11.udemy.programacion.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestApiCollectionsGenerics {
    public static void main(String[] args) {

        System.out.println("***** ArrayList *****");
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        String elemento = miLista.get(0);
        System.out.println("elemento = " + elemento);

        imprimir(miLista);

        System.out.println("***** HashSet *****");
        Set<String> mySet = new HashSet<>();
        mySet.add("Lunes");
        mySet.add("Martes");
        mySet.add("Miercoles");
        mySet.add("Jueves");
        mySet.add("Viernes");
        mySet.add("Viernes"); // No se puede duplicar
        imprimir(mySet);

        System.out.println("***** HashMap *****");
        Map<String,String> myMap = new HashMap<>();
        myMap.put("valor1", "Juan");
        myMap.put("valor2", "Karla");
        myMap.put("valor3", "Rosa");

        String elemento1  = myMap.get("valor1");
        System.out.println("elemento1 = " + elemento1);

        imprimir(myMap.keySet());
        imprimir(myMap.values());

    }

    static void imprimir (Collection<String> collection) {
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
