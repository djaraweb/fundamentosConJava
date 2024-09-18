package com.v11.udemy.programacion.enumeraciones;

public class TestEnumeradores {

    public static void main(String[] args) {
        System.out.println(Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);

        System.out.println("**************** Enumeraciones con metodos ************* ");
        System.out.println("Continente nro 4: " + Continentes.AMERICA);
        System.out.println("No. paises en el 4to continente: " + Continentes.AMERICA.getPaises());
        System.out.println("No. habitantes en el 4to continente: " + Continentes.AMERICA.getHabitantes());

        System.out.println("Continente nro 1: " + Continentes.AFRICA);
        System.out.println("No. paises en el 1er continente: " + Continentes.AFRICA.getPaises());
        System.out.println("No. habitantes en el 1er continente: " + Continentes.AFRICA.getHabitantes());

    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            default:
                System.out.println("Septimo dia de la semana");
        }
    }
}
