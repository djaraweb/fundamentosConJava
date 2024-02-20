package com.udemy.programacion.clasesabstractas;

public abstract class FiguraGeometrica {

    // Las clases abstractas se orientan mas al tema de Herencia
    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
}
