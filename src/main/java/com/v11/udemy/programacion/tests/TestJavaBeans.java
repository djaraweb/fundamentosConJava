package com.v11.udemy.programacion.tests;

import com.v11.udemy.programacion.javabeans.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Pepe");
        persona.setApellido("Rodriguez");

        System.out.println("Persona = " + persona);
        System.out.println("Persona nombre:" + persona.getNombre());
        System.out.println("Persona apellido:" + persona.getApellido());
    }
}
