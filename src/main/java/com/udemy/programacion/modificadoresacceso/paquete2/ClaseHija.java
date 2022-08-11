package com.udemy.programacion.modificadoresacceso.paquete2;

import com.udemy.programacion.modificadoresacceso.paquete1.Clase1;

public class ClaseHija extends Clase1 {
    public ClaseHija(){
        super();
        this.atributoProtected = "Modificación atributo protegido";
        System.out.println("atributoProtected = " + atributoProtected);
            
    }
}
