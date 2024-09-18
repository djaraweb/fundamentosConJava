package com.v11.udemy.programacion.tests;

import com.v11.udemy.programacion.clasesabstractas.FiguraGeometrica;
import com.v11.udemy.programacion.clasesabstractas.Rectangulo;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        // FiguraGeometrica figura = new FiguraGeometrica();
        /*
        No se pueden instanciar clases abstractas, por ello aplicamos polimorfismo
        para instanciar una clase que se hereda.
         */

        // Formatear código : ⌥⌘L

        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
