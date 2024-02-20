package com.udemy.programacion.excepciones;

public class Aritmetica {

    public static int division(int numerador, int denominador) throws OperationException {
        if (denominador == 0) {
            throw new OperationException("División entre cero");
        }
        return numerador/denominador;
    }
}
