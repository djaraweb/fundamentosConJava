package com.v11.udemy.programacion.modificadoresacceso.paquete1;

public class Clase1 {
    public String atributoPublico = "Valor del atributo Publico";
    protected String atributoProtected = "Valor del atributo Protected";

    public Clase1(String parametro){
        System.out.println("Accede al Constructor Publico");
    }

    protected Clase1(){
        System.out.println("Accede al Constructor Publico");
    }

    public void metodoPublico(){
        System.out.println("Ejecuta Metodo Publico");
    }

    protected void metodoProtected(){
        System.out.println("Ejecuta Metodo Protected");
    }
}
