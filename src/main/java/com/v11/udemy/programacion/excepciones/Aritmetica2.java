package com.v11.udemy.programacion.excepciones;

public class Aritmetica2 {

    public static int division(int numerador, int denominador)  {
        if (denominador == 0) {
            throw new OperationRuntimeException("División entre cero");
        }
        return numerador/denominador;
    }
}
