package com.udemy.programacion.conversionobjetos;

public class TestConversionObjetos {

    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 1500., TipoEscritura.CLASICO);

        System.out.println("empleado = " + empleado);

        System.out.println(empleado.obtenerDetalles());
        //down casting
        ((Escritor) empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();

        // up casting no es necesario
        Empleado empleado1 = escritor;
        System.out.println(empleado1.obtenerDetalles());


    }
}
