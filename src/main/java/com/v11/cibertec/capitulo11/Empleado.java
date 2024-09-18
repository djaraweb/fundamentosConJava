package com.v11.cibertec.capitulo11;

public class Empleado {
    private int codigo;
    private String nombre;
    private String cargo;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(int codigo, String nombre, String cargo, double sueldo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public double calcularNeto() {
        double neto = 0;
        switch (this.cargo) {
            case "Gerente":
                neto = sueldo * 0.95;
                break;
            case "Asistente":
                neto = sueldo * 0.85;
                break;
            case "Administrativo":
                neto = sueldo * 0.50;
                break;
            case "Tecnico":
                neto = sueldo * 0.20;
                break;
        }
        return neto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
