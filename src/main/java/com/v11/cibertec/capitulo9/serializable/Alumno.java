package com.v11.cibertec.capitulo9.serializable;

import java.io.Serializable;

public class Alumno implements Serializable {
    private String nombre;
    private String apellido;
    private Direccion direccion;

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

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Alumno(String nombre, String apellido, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alumno{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", direccion=").append(direccion);
        sb.append('}');
        return sb.toString();
    }
}
