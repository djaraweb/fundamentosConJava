package com.v11.udemy.programacion.intefaces;

public interface IAccesoDatos {
    // Las interfaces se orientan mas al comportamiento
    int MAX_REGISTRO = 10;
    void insertar();
    void listar();
    void actualizar();
    void eliminar();

}
