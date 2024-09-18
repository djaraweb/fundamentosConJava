package com.v11.cibertec.capitulo7.teoria;

import java.util.HashSet;
import java.util.Set;

public class PrincipalSet {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();

        frutas.add("manzana");
        frutas.add("naranja");
        frutas.add("mandarina");
        frutas.add("manzana"); // En el tipo (Set) no agrega elementos repetidos
        frutas.add("melocoton");

        System.out.println("frutas = " + frutas);

        // Cuando se usa SET se debe considerar el hasCode de los objetos para evitar duplicados.
        System.out.println("****************************");
        Set<Persona> setPersonas = new HashSet<>();
        Persona persona1 = new Persona("44444444","juan","Palacios",20);
        Persona persona2 = new Persona("44444444","juan","Palacios",20);
        Persona persona3 = new Persona("22222222","juan","Palacios",20);

        setPersonas.add(persona1);
        setPersonas.add(persona2); // No se agrega por hacer referencia al objeto persona1 (se define el equals en Persona)
        setPersonas.add(persona3);

        System.out.println("El tamaño del Set es:" + setPersonas.size());
        System.out.println("****************************");
        System.out.println("El conjunto setPersonas contiene al objeti persona1: " + setPersonas.contains(persona1));



    }
}
