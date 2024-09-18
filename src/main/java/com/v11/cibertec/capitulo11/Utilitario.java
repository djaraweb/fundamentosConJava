package com.v11.cibertec.capitulo11;

public class Utilitario {

    public double calcularPromedio(double nota1, double nota2) {
        double suma = nota1 + nota2;
        return suma / 2;
    }

    public boolean comprobarImpar(int valor) {
        if (valor % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
