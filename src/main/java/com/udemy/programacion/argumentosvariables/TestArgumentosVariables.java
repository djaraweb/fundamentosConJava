package com.udemy.programacion.argumentosvariables;

public class TestArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2);
        variosParametros("Juan",5,96,34,65);
    }

    private static void imprimirNumeros(int... numeros){
        // Los (...) indican una cantidad indefinida de elementos
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("elemento: " + numeros[i]);
        }
        System.out.println("********************************************");
    }

    private static void variosParametros(String nombre, int... numeros){
        // Para declarar un parametro con argumentos indefinido debe ir al final
        System.out.println("nombre: " + nombre);
        imprimirNumeros(numeros);
    }

}
