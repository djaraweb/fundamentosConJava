package com.v11.cibertec.capitulo6.generic;

public class Generica<T> {
    T propiedad;

    Generica(T objetoConstructor) {
        propiedad = objetoConstructor;
    }

    public T getPropiedad() {
        return propiedad;
    }

    void mostrarTipo() {
        System.out.println("El tipo pasado a la clase es: " + propiedad.getClass().getName());
    }
}
