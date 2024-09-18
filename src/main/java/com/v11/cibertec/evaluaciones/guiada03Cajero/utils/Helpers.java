package pe.edu.cibertec.evaluaciones.guiada03Cajero.utils;

import java.util.Scanner;

public final class Helpers {

    public static void mostrarOpcionesMenu() {
        StringBuilder sbMsg = new StringBuilder();
        sbMsg
                .append("1. Crear una cuenta vacia. (Solicita los datos del cliente y crea cuenta con saldo en CERO)").append("\n")
                .append("2. Crear una cuenta con saldo inicial. (Solicita los datos del cliente y crea cuenta con un saldo solicitado)").append("\n")
                .append("3. Depositar. (solicita el DNI del cliente, clave y cuenta y agrega saldo en la cantidad ingresada ).").append("\n")
                .append("4. Retirar. (solicita el DNI del cliente, clave  y cuenta y resta saldo en la cantidad ingresada, ojo el saldo no debe quedar negativo, si no se puede dar el saldo indica monto invalido ).").append("\n")
                .append("5. Cambiar clave de Cliente. (Solicita DNI y Cuenta, clave anterior si es valido solicita la nueva clave)").append("\n")
                .append("6. Consultar saldo. (Solicita DNI, clave y cuenta, muestra el saldo)").append("\n")
                .append("7. Mostrar información de cuenta. (solicita dni, clave y cuenta, Muestra los datos del cliente y su cuenta)").append("\n")
                .append("8. Salir");

        System.out.println(sbMsg.toString());

    }

    public static void evaluarOpciones(int opcion){
        switch (opcion){
            case 1:
                // 1. Crear una cuenta vacia. (Solicita los datos del cliente y crea cuenta con saldo en CERO)
                System.out.println("ddd");
                break;
            case 8:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Codigo no esta permitido, ingrese un valor (1-8)");
                break;
        }
    }
    private static void crearCuenta(Scanner scanner){

    }
}
