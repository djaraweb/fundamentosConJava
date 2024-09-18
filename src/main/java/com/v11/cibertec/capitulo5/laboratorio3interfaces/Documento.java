package pe.edu.cibertec.capitulo5.laboratorio3interfaces;

import java.util.Date;

public abstract class Documento {
    String nombre;
    String ruta;
    Date fechaCreacion;
    double tamaño;

    void mostrarInfoSinBody() {
    }

    void mostrarInfoConBody() {
        System.out.printf("InfoConBody");
    }


}
