package com.udemy.programacion.tests;

import com.udemy.programacion.excepciones.Aritmetica;
import com.udemy.programacion.excepciones.Aritmetica2;
import com.udemy.programacion.excepciones.OperationException;

public class TestExcepciones {

    public static void main(String[] args) {
        divisionConExeption();
        //divisionConRuntimeExeption();
    }

    public static void divisionConExeption(){
        int resultado =0;
        try {
            resultado = Aritmetica.division(10,0);
        }catch (OperationException ex) {
            System.out.println("Ocurrio un error de tipo OperationException");
            //ex.printStackTrace(System.out);
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println("Ocurrio un error del tipo Exception");
            //ex.printStackTrace(System.out);
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Se reviso la división entre cero");
        }

        System.out.println("Resultado = " + resultado);
    }

    public static void divisionConRuntimeExeption(){

        int resultado =0;
            resultado = Aritmetica2.division(10,0);
        System.out.println("Resultado = " + resultado);
    }
}
