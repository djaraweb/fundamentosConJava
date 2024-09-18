package pe.edu.cibertec.capitulo5.laboratorio4encapsulamiento;

import java.util.Date;

public abstract class Documento {
    private String nombre;
    private String ruta;
    private Date fechaCreacion;
    private double tamaño;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    void mostrarInfoSinBody() {
    }

    void mostrarInfoConBody() {
        System.out.printf("Monstrar InfoConBody");
    }


}
