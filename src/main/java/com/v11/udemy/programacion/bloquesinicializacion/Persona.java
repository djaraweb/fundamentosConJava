package com.v11.udemy.programacion.bloquesinicializacion;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    // Se ejecuta al crear en memoria
    static {
        System.out.println("Ejecucion Bloque estatico");
        ++Persona.contadorPersonas;
    }

    // Se ejecuta al crear un objeto de la clase
    {
        System.out.println("Ejecucion Bloque no estatico o dinámico");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona(){
        System.out.println("Ejecución del constructor de la clase");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
}
