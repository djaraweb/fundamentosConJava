package com.v11.cibertec.capitulo2;

import java.util.Scanner;

public class TeoriaCapitulo2 {

    public static void showSession01() {
        System.out.println("************** =========================================================== *********");
        System.out.println("**************************** Capitulo 02 **********************************");
        System.out.println("************** =========================================================== *********");

        System.out.println("OperacionesPrimitivos:");

        System.out.println("Casteo Explicito:");
        byte numero = 7;
        byte otroNumero = 12;
        System.out.println("El resultado es:" + (byte) (numero + otroNumero));

        System.out.println("Casteo Implicito:");
        int a = 20;
        int b = 50;
        int c = 20 * 50;
        long valor = c;

        System.out.println("El resultado es:" + c);
        float decimal = 12.35f;

        // Clases Wrapper
        Integer x = 1;

        // Strings, son Inmutables, realizan bastante desgaste de memoria:
        String cadena1 = "Hola Mundo"; //Genera un espacio en memoria 1
        String cadena2 = "Java"; //Genera un espacio en memoria 2
        cadena1 = cadena1 + cadena2;  //Genera un espacio en memoria 3

        // Se recomienda usar StringBuilder para concadenar mensajes:
        StringBuilder msg = new StringBuilder();
        msg.append("Hola Mundo").append("Java");

    }

    public static void showSesion01PracticaLaboratorio02() {
        System.out.println("************** =========================================================== *********");
        System.out.println("************** Practica Laboratorio 02: Implementar una CalculadoraWrapper *********");
        System.out.println("************** =========================================================== *********");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el 1er valor: ");
        Double operando1 = teclado.nextDouble(); // 12.34;
        System.out.print("Ingrese el 2do valor: ");
        Double operando2 = teclado.nextDouble(); // 43.21;
        teclado.close();

        //Double operando1 = 12.34;
        //Double operando2 = 43.21;

        CalculadoraWrapper calculadorawp = new CalculadoraWrapper();
        StringBuilder sbuilder = new StringBuilder();
        int suma = calculadorawp.sumar(operando1.intValue(), operando2.intValue());
        sbuilder.append("La suma es = ").append(suma);
        sbuilder.append("\n");
        sbuilder.append("La resta es = ").append(calculadorawp.restar(operando1.longValue(), operando2.longValue()));
        sbuilder.append("\n");
        sbuilder.append("La multiplicacion es = ").append(calculadorawp.multiplicar(operando1.floatValue(), operando2.floatValue()));
        sbuilder.append("\n");
        sbuilder.append("La division es = ").append(calculadorawp.dividir(operando1.doubleValue(), operando2.doubleValue()));
        sbuilder.append("\n");

        System.out.println(sbuilder);
    }


    public static void showSesion01TrabajoDeCaja() {
        System.out.println("************** =========================================================== *********");
        System.out.println("**************             Practica Trabajo de Casa                        *********");
        System.out.println("************** =========================================================== *********");

        System.out.println("1. Solicitar tu nombre por consola y muestre como salida  un mensaje de Bienvenida");

        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingreso su nombre: ");
        String nombre = teclado.next();
        System.out.println("Bienvenido al mundo Java " + nombre + "!!!!");
        System.out.println("");

        System.out.println("2. Solicitar un numero por teclado e indicar si es par o impar.");
        System.out.print("Ingreso un número: ");
        Integer numero = teclado.nextInt();
        if (numero % 2==0){
            System.out.println("El número ingresado ("+ numero + ") es PAR");
        }else {
            System.out.println("El número ingresado ("+ numero + ") es IMPAR");
        }
        System.out.println("");

        System.out.println("3. solicita la base y la altura de un triangulo y muestre su area.");
        System.out.print("Ingrese la base de un triángulo: ");
        Integer baseTriangulo = teclado.nextInt();
        System.out.print("Ingrese la altura de un triángulo: ");
        Integer alturaTriangulo = teclado.nextInt();
        Integer area = baseTriangulo * alturaTriangulo;
        System.out.println("El área del triángulo es: " + area);

    }


}
