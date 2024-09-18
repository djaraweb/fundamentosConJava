package com.v11.udemy.helpers;

import java.util.Scanner;

public class ScannerManager {
    public static int leerInt (Scanner scanner, String mensaje) {
        System.out.printf("%s", mensaje);
        return scanner.nextInt();
    }

    public static double leerDouble (Scanner scanner, String mensaje) {
        System.out.printf("%s", mensaje);
        return scanner.nextDouble();
    }

    public static String leerString (Scanner scanner, String mensaje) {
        System.out.printf("%s", mensaje);

        return scanner.nextLine();
    }

    public static char leerChar (Scanner scanner, String mensaje) {
        System.out.printf("%s", mensaje);
        return scanner.next().charAt(0);
    }

    public static boolean leerBoolean (Scanner scanner, String mensaje) {
        System.out.printf("%s", mensaje);
        return scanner.nextBoolean();
    }


}
