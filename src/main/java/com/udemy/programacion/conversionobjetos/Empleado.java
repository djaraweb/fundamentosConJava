package com.udemy.programacion.conversionobjetos;

public class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, Double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles(){
        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
}
