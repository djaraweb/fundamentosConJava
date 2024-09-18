package com.v11.udemy.programacion.tests;

import com.v11.udemy.programacion.clasesgenericas.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenertipo();

        ClaseGenerica<String> objetoString = new ClaseGenerica("Juan");
        objetoString.obtenertipo();
    }
}
