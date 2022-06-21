package com.udemy.sobrecargametodos;

public class Ejecutora {

    public static void main(String[] args) {
        int resultado1 = Operaciones.sumar(5,3);
        System.out.println("resultado1 = " + resultado1);

        double resultado2 = Operaciones.sumar(2.0,3);
        System.out.println("resultado2 = " + resultado2);

        double resultado3 = Operaciones.sumar(3,5L);
        System.out.println("resultado3 = " + resultado3);
    }
}
