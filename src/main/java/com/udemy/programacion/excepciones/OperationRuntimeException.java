package com.udemy.programacion.excepciones;

public class OperationRuntimeException extends RuntimeException{
    public OperationRuntimeException(String mensaje) {
        super(mensaje);
    }
}
