package pe.edu.cibertec.capitulo5;

import java.util.Scanner;

public class TeoriaCapitulo5 {

    public static void showLaboratorio02() {
        System.out.println("************** ================================================== *********");
        System.out.println("**************************** Capitulo 05 **********************************");
        System.out.println("************** ================================================== *********");

        System.out.println("1. Herencia en clases:");
        Empleado emp = new Empleado();
        // Propiedades del Padre
        emp.codigo = 0;
        emp.nombre = "Carlos";
        emp.edad = 25;

        // Propiedades Propias
        emp.sueldo = 1520.20;
        emp.comer();


    }
}
