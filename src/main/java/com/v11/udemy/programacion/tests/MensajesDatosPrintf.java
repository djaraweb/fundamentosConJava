package com.v11.udemy.programacion.tests;

public class MensajesDatosPrintf {
    public static void main(String[] args) {
        final var profesion="Abogado";
        final var cantidadJuiciosGanados = 3;
        final var letraFavorita = 'C';
        final var peso = 80.52;
        final var esColegiado=false;

        /**
         * int (%d)
         * String (%s)
         * char (%c)
         * double (%f)
         * boolean (%b)
         * salto de línea (enter) (%n)
         */

        System.out.printf("Yo soy %s y tengo $d juicios ganados%n", profesion, cantidadJuiciosGanados);
        System.out.printf("Mi letra favorita es %c%n", letraFavorita);

        /**
         * Se reemplaza %f por el valor del peso
         * el .2 indica que solo se mostraran 2 decimales
         */
        System.out.printf("Actualmete, estoy pesando %.2f%n", peso);

        System.out.printf("Estoy colegiado? %b%n", esColegiado);

    }
}
