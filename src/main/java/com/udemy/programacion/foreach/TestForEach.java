package com.udemy.programacion.foreach;

public class TestForEach {

    public static void main(String[] args) {
        int edades[] = {15,20,26,18,59,60};

        for (int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Juan"), new Persona("Carla"), new Persona("David")};
        
        for (Persona persona: personas){
            System.out.println("persona = " + persona);
        }

    }
}
