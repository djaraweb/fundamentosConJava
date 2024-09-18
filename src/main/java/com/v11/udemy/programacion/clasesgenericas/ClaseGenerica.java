package com.v11.udemy.programacion.clasesgenericas;

public class ClaseGenerica <T> {
    private T objeto;
    public ClaseGenerica( T objeto) {
        this.objeto = objeto;
    }

    public void obtenertipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}
