package com.v11.cibertec.capitulo12.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PruebaPattern {

    public static void main(String[] args) {
        Pattern patron = Pattern.compile(";");
        String cadena = "Nuevo;Curso;Java;Fundamentos";
        String partes[] = patron.split(cadena);
        for (String parte : partes) {
            System.out.println(parte);
        }

        System.out.println("*** Comparando cadenas ***");
        patron = Pattern.compile(".");
        Matcher m1 = patron.matcher("X");
        System.out.println(m1.matches());
        Matcher m2 = patron.matcher("XYZ");
        System.out.println(m2.matches());

        System.out.println("*** Comparando dos cadenas ***");
        patron = Pattern.compile("[abc]");
        m1 = patron.matcher("b");
        System.out.println(m1.matches());
        m2 = patron.matcher("e");
        System.out.println(m2.matches());

        System.out.println("*** Comparando numeros de telefonos PERU ***");
        patron = Pattern.compile("\\(\\d{3}\\)\\d{3}-?\\d{4}");
        m1 = patron.matcher("(051)485-6368");
        System.out.println(m1.matches());
        m2 = patron.matcher("442-12545");
        System.out.println(m2.matches());



    }
}
