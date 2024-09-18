package com.v11.udemy.fundamentos.entities;

public class Persona {
    // Atributos
    // Modificadores de Acceso:
    /*
    private: solo es accesible dentro de la clase
    protected: es accesible para cualquier clase que hereda la clase

     */

    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    protected String apellido;
    protected boolean activo;

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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Métodos de la clase
    public Persona(){}
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    public Persona(String nombre, char genero, int edad, String direccion, String apellido, boolean activo) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.apellido = apellido;
        this.activo = activo;
    }

    public Persona(String nombre, boolean activo){
        this.nombre = nombre;
        this.activo = activo;
    }
    public void desplegarInformacion(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", activo=").append(activo);
        sb.append('}');
        return sb.toString();
    }
}
