package com.udemy.programacion.tests;

import com.udemy.programacion.intefaces.IAccesoDatos;
import com.udemy.programacion.intefaces.ImplementacionOracle;
import com.udemy.programacion.intefaces.ImplementarMySql;

public class TestInterfaces {
    public static void main(String[] args) {
        //IAccesoDatos datos = new IAccesoDatos();

        IAccesoDatos datos = new ImplementarMySql();
        datos.listar();
        registrar(datos);

        datos = new ImplementacionOracle();
        datos.listar();

        registrar(datos);

    }
    public static void registrar(IAccesoDatos datos) {
        datos.insertar();
    }
}
