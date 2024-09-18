package com.v11.cibertec.capitulo3;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class TeoriaCapitulo3 {

    public static void showSession01() {
        System.out.println("************** ================================================== *********");
        System.out.println("**************************** Capitulo 03 **********************************");
        System.out.println("************** ================================================== *********");

        Scanner teclado = new Scanner(System.in);
        System.out.println("1. Calcular el mayor y menor de dos Números");
        System.out.print("Ingrese 1er número: ");
        Integer primerNumero = teclado.nextInt();
        System.out.print("Ingrese 2do número: ");
        Integer segundoNumero = teclado.nextInt();

        if (primerNumero > segundoNumero) {
            System.out.println("El mayor número es: " + primerNumero);
            System.out.println("El menor número es: " + segundoNumero);
        } else {
            System.out.println("El mayor número es: " + segundoNumero);
            System.out.println("El menor número es: " + primerNumero);
        }
        System.out.println("");

    }

    public static void showLaboratorio01() {
        System.out.println("************** ================================================== *********");
        System.out.println("******************* Laboratorio - Comparar 2 números ***********************");
        System.out.println("************** ================================================== *********");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese 1er número: ");
        Integer numberOne = teclado.nextInt();
        System.out.print("Ingrese 2do número: ");
        Integer numberTwo = teclado.nextInt();
        teclado.close();

        if (numberOne > 10 || numberTwo > 10) {
            System.out.println("Los números deben ser menores a 10");
        } else {
            Integer biggerNumber = numberOne;
            if (numberOne > numberTwo) {
                System.out.println("Primer número(" + numberOne + ") es mayor que el segundo(" + numberTwo + ")");
            } else if (numberTwo > numberOne) {
                biggerNumber = numberTwo;
                System.out.println("Segundo número(" + numberTwo + ") es mayor que el primero(" + numberOne + ")");
            }

            System.out.println("El mayor número es: ");
            switch (biggerNumber) {
                case 0:
                    System.out.println("Cero");
                    break;
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Dos");
                    break;
                case 3:
                    System.out.println("Tres");
                    break;
                case 4:
                    System.out.println("Cuatro");
                    break;
                case 5:
                    System.out.println("Cinco");
                    break;
                case 6:
                    System.out.println("Seis");
                    break;
                case 7:
                    System.out.println("Siete");
                    break;
                case 8:
                    System.out.println("Ocho");
                    break;
                case 9:
                    System.out.println("Nueve");
                    break;
            }
        }
    }

    public static void showLaboratorio02() {
        System.out.println("************** ================================================== *********");
        System.out.println("******************* Laboratorio - Comparar 2 números ***********************");
        System.out.println("************** ================================================== *********");

        Integer numberOne = 0;
        Integer numberTwo = 0;

        Scanner teclado = new Scanner(System.in);

        while (numberOne >= 10) {
            System.out.print("Ingrese 1er número: ");
            numberOne = teclado.nextInt();
        }

        while (numberTwo >= 10) {
            System.out.print("Ingrese 2do número: ");
            numberTwo = teclado.nextInt();
        }
        teclado.close();

        Integer biggerNumber = numberOne;
        if (numberOne > numberTwo) {
            System.out.println("Primer número(" + numberOne + ") es mayor que el segundo(" + numberTwo + ")");
        } else if (numberTwo > numberOne) {
            biggerNumber = numberTwo;
            System.out.println("Segundo número(" + numberTwo + ") es mayor que el primero(" + numberOne + ")");
        }

        System.out.println("El mayor número es: ");
        switch (biggerNumber) {
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
        }
    }

    public static void showSession02() {
        System.out.println("************** ================================================== *********");
        System.out.println("**************************** Capitulo 03 **********************************");
        System.out.println("************** ================================================== *********");

        System.out.println("** 1. Manejo de Arrays **");

        int count = 1;
        int numbers[] = new int[5];
        System.out.println("Ingrese 5 números enteros: ");
        // llenar el Array
        Scanner scanner = new Scanner(System.in);
        while (count != 6) {
            System.out.print("Ingrese el número" + count + " : ");
            numbers[count - 1] = scanner.nextInt();
            count++;
        }
        scanner.close();

        int mayor = 0;
        int menor = 999999;
        System.out.println("****** -------------------- ******");
        System.out.println("Los números ingresados fueron: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > mayor)
                mayor = numbers[i];
            if (numbers[i] < menor)
                menor = numbers[i];
            System.out.println(numbers[i]);
        }
        System.out.println("****** -------------------- ******");
        System.out.println("El número mayor ingresado es: " + mayor);
        System.out.println("El número menor ingresado es: " + menor);

        System.out.println("** 2. break and continue **");


        while (true) {
            int second = Calendar.getInstance().get(Calendar.SECOND);
            System.out.println("Second: " + second);
            if (second % 10 == 0) break;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



        int [][] matriz = {{5,10,15},{4,8,12},{3,6,9}};

    }

}
