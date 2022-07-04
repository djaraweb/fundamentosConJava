package com.udemy.arreglos;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        edades[0] = 8;
        System.out.println("edades[0] = " + edades[0]);
        edades[1] = 20;
        edades[2] = 89;
        
        for (int edad: edades){
            System.out.println("edad = " + edad);
        }

        // Sintaxis resumida
        String frutas[] = {"naranja","platano", "uva"};

        for (String fruta: frutas){
            System.out.println("fruta = " + fruta);
        }
    }
}
