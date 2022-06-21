package com.udemy.entities;

public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private boolean activo;
    private Double sueldo;

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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    // Métodos de la clase
    public Persona(){}
    public Persona(String nombre, Double sueldo, boolean activo){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.activo = activo;
    }
    public void desplegarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", activo=" + activo +
                ", sueldo=" + sueldo +
                '}';
    }
}
