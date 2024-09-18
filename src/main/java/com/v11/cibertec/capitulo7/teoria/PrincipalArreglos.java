package com.v11.cibertec.capitulo7.teoria;

import java.util.ArrayList;
import java.util.List;

public class PrincipalArreglos {
    public static void main(String[] args) {

        String saludo = "Hola mundo";
        char[] caracteres = saludo.toCharArray();
        for (char caracter : caracteres) {
            System.out.println("caracter = " + caracter);
        }

        System.out.println("*********** Collections **********");
        List<String> dias = new ArrayList<>();
        dias.add("lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");
        dias.add("Sabado");
        System.out.println("1era Forma de recorrer una List");
        for (String dia : dias) {
            System.out.println("dia = " + dia);
        }
        System.out.println("1era Forma de recorrer una List");
        for (int i=0; i<dias.size();i++){
            System.out.println("dia = " + dias.get(i));
        }


    }
}
