package com.v11.udemy.fundamentos.usodepalabrafinal;

public class TestFinal {

    public static void main(String[] args) {
        // Uso de la palabra final en variables: indica que no se podra cambiar el valor de la variable
        final int contador = 10;
        System.out.println("contador = " + contador);
        // contador++; //Cannot assign a value to final variable 'contador'

        // Al declarar una variable con final del tipo Clase, no se podra realizar apuntar a una nueva referencia en memoria.
        // pero si se podra modificar la informacion dentro de la clase.
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); //Cannot assign a value to final variable 'persona1'
        persona1.setNombre("Juan");
        System.out.println(persona1.toString());
        persona1.setNombre("Pablo");
        System.out.println(persona1.toString());


    }
}
