package com.v11.udemy.programacion.foreach;

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

        System.out.println("***************************************");
        mostrarNumerosParesImpares(1,5,20,14,85,26);
    }

    private static void mostrarNumerosParesImpares(int... numeros)
    {
        for(int numero: numeros){
            if (numero%2==0)
                System.out.println("Numero: (" + numero + ") es par");
            else
                System.out.println("Numero: (" + numero + ") es impar");
        }
    }
}
