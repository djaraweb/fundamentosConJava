package com.udemy.programacion.modificadoresacceso.test;

import com.udemy.programacion.modificadoresacceso.paquete1.Clase1;
import com.udemy.programacion.modificadoresacceso.paquete2.ClaseHija;

public class TestModificadoresAcceso {

    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Publico");
        System.out.println("clase1.toString() = " + clase1.toString());
        System.out.println("clase1 (Atributo Publico) = " + clase1.atributoPublico);

        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija.toString() = " + claseHija.toString());

    }
}
