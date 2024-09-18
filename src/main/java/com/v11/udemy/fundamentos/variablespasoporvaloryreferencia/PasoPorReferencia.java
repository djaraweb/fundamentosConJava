package com.v11.udemy.fundamentos.variablespasoporvaloryreferencia;

import com.v11.udemy.fundamentos.entities.Persona;

public class PasoPorReferencia {

    public static void main(String[] args) {
       Persona persona_1 = new Persona("David",true);
       persona_1.setNombre("Juan");
        System.out.println("persona1 : " + persona_1.toString());
        System.out.println("persona1 Nombre: " + persona_1.getNombre());

        cambiarValor(persona_1); // persona_1, almacena el valor de la referencia del objeto que se creo.
        System.out.println("persona1 cambio de Nombre: " + persona_1.getNombre());
        System.out.println("persona1 : " + persona_1.toString());
    }

    public static void cambiarValor(Persona persona){
        // El cambio de valores por paso de referencia aplica para objetos.
        persona.setNombre("Karla");
        persona.setActivo(false);
        persona.setApellido("Palacios");
    }
}
