package com.v11.cibertec.homework.trabajo02;


import java.util.Scanner;

public class Ejecutora {

    interface IntegerMath {
        int operacion(int numero);
    }

    public int calcular(int numero, IntegerMath op) {
        return op.operacion(numero);
    }

    public double factorialNumero(int numero){
        return numero*5;
    }

    public static void main(String[] args) {
        // Lambda -> Factorial de un número
        OperationMath factorial = (numero) -> {
            int fact=1;
            while(numero!=0){
                fact=fact*numero; numero--;
            }
            return fact;
        };

        OperationArray promedioNumeros = (numeros) ->{
            int suma=0;
            for (int i=1;i<numeros.length;i++){
                suma+=numeros[i];
            }
            return suma/ numeros.length;
        };

        System.out.println("********** ================================================== **********");
        System.out.println(" 1. Factorial de un número con Lambda ");
        System.out.println("********** ================================================== **********");

        System.out.printf(" Ingrese un número : ");
        Scanner inputTeclado = new Scanner(System.in);
        Integer numeroIngresado = inputTeclado.nextInt();;

        System.out.println("El factorial de (" + numeroIngresado + ") es: " + factorial.calcular(numeroIngresado));

        System.out.println("********** ================================================== **********");
        System.out.println(" 2.1 Crear una función anónima que nos permita calcular el promedio de un arreglo de números enteros. ");
        System.out.println("********** ================================================== **********");

        System.out.printf(" Ingrese un números entero para obtener el promedio: ");
        int cantidadNumeros=inputTeclado.nextInt();
        int numeros[] = new int[cantidadNumeros];
        int contadorNumeros=1;
        for(int i=0; i<cantidadNumeros;i++){
            System.out.println(" Ingrese el número (" + (i+1) + ") : ");
            numeros[i] = Integer.parseInt(inputTeclado.next());
        }
        System.out.println("El promedio de los numeros ingresados es: " + promedioNumeros.calcular(numeros));



    }
}
