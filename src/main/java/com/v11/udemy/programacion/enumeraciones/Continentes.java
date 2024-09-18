package com.v11.udemy.programacion.enumeraciones;

public enum Continentes {
    AFRICA(53, "5.5 billones"),
    EUROPA(46,"4.5 billones"),
    ASIA(44,"2.5 billones"),
    AMERICA(34,"1.5 billones"),
    OCEANIA(14,"0.5 millones");

    private final int paises;
    private final String habitantes;

    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }

    public int getPaises(){
        return this.paises;
    }

    public String getHabitantes(){
        return this.habitantes;
    }

}
