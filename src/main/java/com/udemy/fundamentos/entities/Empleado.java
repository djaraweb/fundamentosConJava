package com.udemy.fundamentos.entities;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(){
        this.idEmpleado =  ++Empleado.contadorEmpleado;
    }
    public Empleado(String nombre, double sueldo){
        //super(nombre);
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo).append(", ");
        //sb.append(", Nombre=").append(this.nombre);
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
