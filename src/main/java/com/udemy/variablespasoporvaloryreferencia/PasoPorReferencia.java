package com.udemy.variablespasoporvaloryreferencia;

import com.udemy.entities.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {
       Persona persona_1 = new Persona();
       persona_1.nombre = "Juan";

        System.out.println("persona1 Nombre: " + persona_1.nombre);
        cambiarValor(persona_1); // persona_1, almacena el valor de la referencia del objeto que se creo.
        System.out.println("persona1 cambio de Nombre: " + persona_1.nombre);
    }

    public static void cambiarValor(Persona persona){
        // El cambio de valores por paso de referencia aplica para objetos.
        persona.nombre = "Karla";
    }
}
