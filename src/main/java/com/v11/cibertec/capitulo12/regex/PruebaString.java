package com.v11.cibertec.capitulo12.regex;

import java.util.List;
import java.util.stream.Collectors;

public class PruebaString {

    public static void main(String[] args) {
        // prueba isBlank();
        String cadena = "Cibertec";
        System.out.println("vacio " + cadena + " ? " + cadena.isBlank());
        cadena = "";
        System.out.println("vacio " + cadena + " ? " + cadena.isBlank());
        cadena = "\t \t";
        System.out.println("vacio " + cadena + " ? " + cadena.isBlank());


        System.out.println(" -- Lineas en una cadena --");
        String lineasCadena = "Bienvenidos\na1\ncurso\rJava";
        System.out.println(lineasCadena);
        List lineas = lineasCadena.lines().collect(Collectors.toList());
        System.out.println(lineas);

    }
}
