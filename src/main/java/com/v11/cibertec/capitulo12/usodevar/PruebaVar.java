package com.v11.cibertec.capitulo12.usodevar;

import java.util.HashMap;

public class PruebaVar {

    public static void main(String[] args) {
        var cadena = "CIBERTEC";
        if (cadena.equalsIgnoreCase("CiberTec"))
            System.out.println("Son Iguales");

        //Asigna un tipo de dato entero a la variable en una línea posterior y verifica que da
        //error de compilación, pues son tipos de datos diferentes.

        // cadena = 15;

        var map = new HashMap<String,String>();
        var padre = new Object();
        padre = new String("Hola mundo");
        System.out.println("Contenido del padre=" + padre.toString());

    }
}
