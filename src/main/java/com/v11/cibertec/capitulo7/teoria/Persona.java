package com.v11.cibertec.capitulo7.teoria;

import java.util.Objects;

public class Persona {
    private String nroDni;
    private String nombre;
    private String apellido;
    private int edad;

    public String getNroDni() {
        return nroDni;
    }

    public void setNroDni(String nroDni) {
        this.nroDni = nroDni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nroDni, String nombre, String apellido, int edad) {
        this.nroDni = nroDni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nroDni='").append(nroDni).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (edad != persona.edad) return false;
        if (nroDni != null ? !nroDni.equals(persona.nroDni) : persona.nroDni != null) return false;
        if (nombre != null ? !nombre.equals(persona.nombre) : persona.nombre != null) return false;
        return apellido != null ? apellido.equals(persona.apellido) : persona.apellido == null;
    }

    @Override
    public int hashCode() {
        int result = nroDni != null ? nroDni.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + edad;
        return result;
    }
}
