package com.v11.udemy.fundamentos.arreglos;

public class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        sb.append(", " + super.toString()); //Obtener la direccion de memoria
        return sb.toString();
    }
}
