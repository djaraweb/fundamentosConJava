package com.v11.udemy.fundamentos.variablespasoporvaloryreferencia;

public class PasoPorValor {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);
        cambioValor(x);
        System.out.println("x nuevo valor" + x);

    }
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1=15;
    }
}
