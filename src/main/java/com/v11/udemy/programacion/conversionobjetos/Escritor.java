package com.v11.udemy.programacion.conversionobjetos;

public class Escritor extends Empleado {

    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, Double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        return  super.obtenerDetalles() + ", tipoEscritura: " + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Escritor{");
        sb.append("tipoEscritura=").append(tipoEscritura);
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }

    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }

}
