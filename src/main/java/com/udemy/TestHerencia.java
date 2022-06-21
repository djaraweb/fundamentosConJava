package com.udemy;

import com.udemy.entities.Cliente;
import com.udemy.entities.Empleado;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Learning Fundamentals with Java 11 !");

        System.out.println("**** Test Herencia *****");
        Empleado empleado1 = new Empleado("Juan",500.);
        System.out.println("empleado1 = " + empleado1);

        Date fecha = new Date();

        Cliente cliente1 = new Cliente(fecha,true,"Karla",'F',28,"Jr Junin 871");
        System.out.println("cliente1 = " + cliente1);
    }
}