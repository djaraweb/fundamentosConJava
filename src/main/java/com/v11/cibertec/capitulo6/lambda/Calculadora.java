package com.v11.cibertec.capitulo6.lambda;

public class Calculadora {
    interface IntegerMath {
        int operacion(int a, int b);
    }

    public int calcular(int a, int b, IntegerMath op) {
        return op.operacion(a, b);
    }

    public static void main(String[] args) {
        Calculadora myApp = new Calculadora();
        IntegerMath suma = (a, b) -> a + b;
        IntegerMath resta = (a, b) -> a - b;

        System.out.println("40 + 2 = "+ myApp.calcular(40,2,suma));
        System.out.println("40 + 2 = "+ myApp.calcular(10,10,suma));
    }
}
