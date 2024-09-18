package com.v11.udemy.programacion.tests;

import com.v11.udemy.helpers.RandomUtilities;

import java.util.Random;

public class SistemaFrancesAmortizacion {
    public static void main(String[] args) {

        final var random = new Random();
        var valorPresente = 25000.0;
        //final var valorPresente = RandomUtilities.generateRandomDouble(50000.0, 25000.0, random);
        final var tasaAnual = 0.19;
        var tasaMensual = tasaAnual/12;
        //var plazoMeses=6;
        final var plazoMeses = RandomUtilities.generateRandomInt(6,3, random);
        var cuotaPrestamo = 0.0;

        cuotaPrestamo = valorPresente * (tasaMensual/(1-(1/Math.pow(1+tasaMensual,plazoMeses))));

        System.out.printf("Valor del Prestamo %.2f%n",valorPresente);
        System.out.printf("Tasa Anual %.2f%n",tasaAnual);
        System.out.printf("Tasa Mensual %.4f%n",tasaMensual);

        System.out.printf("La cuota mensual debe ser %.2f durante los %d meses para saldar la deuda%n", cuotaPrestamo, plazoMeses);

        System.out.println("********* Tabla de Amortización ***********");

        //var cadena = String.format("%1$" + 10 + "s", "texto").replace(' ', '0');

        var capitalInsoluto = valorPresente;
        var interes = 0.0;
        var amortizacion = 0.0;
        var saldoInsoluto = 0.0;
        System.out.println(String.format("%1$10s %2$10s %3$10s %4$10s %5$10s",
                "SaldoCapital","      CuotaPrestamo", "      InteresMensual", "   Amortización","  SaldoInsoluto"));
        for (int i = 0; i < plazoMeses; i++) {
            interes = capitalInsoluto*tasaMensual;
            amortizacion = cuotaPrestamo-interes;
            saldoInsoluto = capitalInsoluto - amortizacion;
            System.out.println(String.format("%1$15.2f %2$15.2f %3$15.2f %4$15.2f %5$15.2f",
                    capitalInsoluto,cuotaPrestamo, interes, amortizacion,saldoInsoluto));
            capitalInsoluto = saldoInsoluto;
        }

    }
}
