package com.udemy.fundamentos.arreglos;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        edades[0][0] =20;
        edades[0][1] =15;
        edades[1][0] =10;
        edades[1][1] =17;
        edades[2][0] =8;
        edades[2][1] =18;

        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades = " + ren + "-" + col + ":" + edades[ren][col]);
            }
        }

        //String frutas[][] = new String[3][2];
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora"}};
        imprimir(frutas);
        //for (int ren = 0; ren < frutas.length; ren++) {
        //    for (int col = 0; col < frutas[ren].length; col++) {
        //        System.out.println("frutas = " + ren + "-" + col + ":" + frutas[ren][col]);
        //    }
        //}

        System.out.println("--------------------------------");

        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Pepe");
        imprimir(personas);

    }

    public static void imprimir (Object matriz[][]){
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("matriz = " + ren + "-" + col + ":" + matriz[ren][col]);
            }
        }
    }
}
