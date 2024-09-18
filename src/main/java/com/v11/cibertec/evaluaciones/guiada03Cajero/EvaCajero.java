package pe.edu.cibertec.evaluaciones.guiada03Cajero;

import pe.edu.cibertec.evaluaciones.guiada03Cajero.entity.Cuenta;
import pe.edu.cibertec.evaluaciones.guiada03Cajero.utils.Helpers;

import java.util.HashMap;
import java.util.Scanner;

public class EvaCajero {

    HashMap<String, Cuenta> cuentas = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("**** Operaciones Cajero Automatico **** ");
        System.out.println("-----------------------------------------");
        //Helpers.mostrarOpcionesMenu();
        Scanner scanner = new Scanner(System.in);
        int opcionIngresada=0;
        while (opcionIngresada!=8){
            Helpers.mostrarOpcionesMenu();
            System.out.println("Ingrese una opcion (1-8) según lo que requiera realizar: ");
            opcionIngresada = scanner.nextInt();
            Helpers.evaluarOpciones(opcionIngresada);
        }

    }
}
