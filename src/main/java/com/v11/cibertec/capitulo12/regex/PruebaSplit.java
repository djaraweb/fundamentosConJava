package com.v11.cibertec.capitulo12.regex;

import java.sql.SQLOutput;

public class PruebaSplit {

    public static void main(String[] args) {
        String cadena = "Nuevo;Curso;Java;Fundamentos";
        String partes[] = cadena.split(";");
        for (String parte : partes) {
            System.out.println(parte);
        }

        System.out.println("----- Con Caracter | ------");
        cadena = "Nuevo|Curso|Java|Fundamentos";
        partes = cadena.split("|");
        for (String parte : partes) {
            System.out.println(parte);
        }
        System.out.println("****** El problema es que el parámetro que recibe la función es una “Expresión Regular " +
                "y no una cadena (o Char) como tal. ******");
        partes = cadena.split("\\|");
        for (String parte : partes) {
            System.out.println(parte);
        }

        System.out.println("****** La siguiente prueba será utilizar el segundo parámetro que es un " +
                "entero, que limita las veces que se realizará el Split sobre la cadena. ******");

        partes = cadena.split("\\|",3);
        for (String parte : partes) {
            System.out.println(parte);
        }

    }

}
