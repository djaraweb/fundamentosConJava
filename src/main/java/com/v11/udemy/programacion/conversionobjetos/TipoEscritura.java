package com.v11.udemy.programacion.conversionobjetos;

public enum TipoEscritura {
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");

    private final String descripcion;
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    };

    public String getDescripcion(){
        return this.descripcion;
    }
}
