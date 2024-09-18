package com.v11.cibertec.homework.trabajo01;

import java.util.Scanner;

public class Ejecutora {

    private static void ejecicio01MostrarNumerosPares() {
        System.out.println("********** ================================================== **********");
        System.out.println(" 1.- Elaborar un programa que muestre los numeros pares iniciando en 20 y ");
        System.out.println("     finalizando en 10 inclusive. ");
        System.out.println("********** ================================================== **********");

        Integer intContador = 20;
        while (intContador > 0) {
            if (intContador % 2 == 0) {
                System.out.println("Número par: " + intContador);
            }
            if (intContador == 10) {
                //intContador=-1;
                break; // Salimos el Bucle
            }
            intContador--;
        }
    }

    private static void ejecicio02MostrarNumerosPositivosMayorMenorMedia() {
        System.out.println("********** ================================================== **********");
        System.out.println(" 2.- Escribe un programa que lea números enteros positivos hasta que se introduzca un 0.");
        System.out.println("     El programa deberá mostrar por pantalla la cantidad de números leídos, el mayor, el menor y la media de los números leídos.");
        System.out.println("********** ================================================== **********");

        Boolean bolNroPermitido=true; // Si ingresa un valor de 0, se cambia a false
        Integer intContadorNrosLeidos = 0;
        Integer intNroMayor = 0;
        Integer intNroMenor = 999;
        Integer intSumarNumerosIngresados=0;

        Integer intValorIngresado;
        Scanner scIngresoTeclado = new Scanner(System.in);

        while (bolNroPermitido) {
            System.out.println("Ingrese un valor positivo(+): ");
            intValorIngresado = scIngresoTeclado.nextInt();
            if (intValorIngresado == 0){
                bolNroPermitido=false;
                //break; // salimos del blucle
            }else if (intValorIngresado <0){
                System.out.println("El número ingresado debe ser positivo(+) >= 0 ");
            }else {
                // Realizamos el calculo del Numero Mayor y menor;
                if (intValorIngresado > intNroMayor){
                        //intNroMenor = intNroMayor;
                        intNroMayor = intValorIngresado;
                }
                if (intValorIngresado < intNroMenor){
                    intNroMenor = intValorIngresado;
                }
                // incrementamos el contador de numeros ingresados
                intContadorNrosLeidos++;
                // Sumanos los numeros para obtener la Media
                intSumarNumerosIngresados+=intValorIngresado;
            }
        }
        scIngresoTeclado.close();

        System.out.println("Cantidad de Números leidos :  " + intContadorNrosLeidos);
        System.out.println("El Número mayor es: " + intNroMayor);
        System.out.println("El Número menor es: " + intNroMenor);
        System.out.println("La media de los números leídos: " + intSumarNumerosIngresados/intContadorNrosLeidos);

    }

    private static void ejecicio03MostrarAprobadosDesaprobados() {
        System.out.println("********** ================================================== **********");
        System.out.println(" 3.- Elaborar un programa que solicite 5 notas y nos indique la cantidad");
        System.out.println("     de aprobados y la cantidad de desaprobados. (Nota aprobatoria es 13).");
        System.out.println("********** ================================================== **********");

        Integer intContador = 0;
        Integer intNota = 0;
        Integer intArrNotas[] = new Integer[5];

        Scanner scIngresoTeclado = new Scanner(System.in);
        while (intContador < 5) {
            System.out.println("Ingreso su Nota Nro  " + (intContador+1) + ": ");
            intNota = scIngresoTeclado.nextInt();
            if (intNota < 0 || intNota > 20) {
                System.out.println("El rango de notas es de : (0-20)");
            } else {
                intArrNotas[intContador] = intNota;
                intContador++;
            }
        }
        scIngresoTeclado.close();
        // Verificamos la cantida de Aprobados y Desaprobados
        Integer intNroAprobados = 0;
        Integer intNroDesaprobados = 0;

        System.out.println("Notas Ingresadas: ");
        for (int intLeerNota : intArrNotas
        ) {
            if (intLeerNota < 13) {
                intNroDesaprobados++;
            } else {
                intNroAprobados++;
            }
            System.out.println(intLeerNota);
        }
        System.out.println("Número Aprobados:" + intNroAprobados);
        System.out.println("Número Desaprobados:" + intNroDesaprobados);

    }

    private static void ejecicio04MostrarDoceTerminosSerie() {
        System.out.println("********** ================================================== **********");
        System.out.println(" 4.- Elaborar un programa que imprima 12 terminos de la siguiente serie: 11-22-33-44....");
        System.out.println("********** ================================================== **********");

        StringBuilder stbSerieNumeros = new StringBuilder();
        Integer intSecuenciaSerie = 11;
        for (int i = 1; i <= 12; i++) {
            if (i == 12) {
                stbSerieNumeros.append(intSecuenciaSerie);
            } else {
                stbSerieNumeros.append(intSecuenciaSerie + "-");
            }

            intSecuenciaSerie += 11;
        }
        System.out.println(stbSerieNumeros);

    }


    public static void main(String[] args) {
        //ejecicio01MostrarNumerosPares();
        //ejecicio02MostrarNumerosPositivosMayorMenorMedia();
        //ejecicio03MostrarAprobadosDesaprobados();
        ejecicio04MostrarDoceTerminosSerie();

    }
}
