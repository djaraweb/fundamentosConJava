package com.udemy.entities;

public class Persona {
    // Atributos
    public String nombre;
    public String apellido;

    // Métodos de la clase
    public void desplegarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }
}
