package com.v11.cibertec.capitulo7.stream;

public class Alumno {
    private String nombre;
    private String curso;
    private Integer nota;
    private Double pension;

    public Double getPension() {
        return pension;
    }

    public void setPension(Double pension) {
        this.pension = pension;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Alumno(String nombre, String curso, Integer nota, Double pension) {
        this.nombre = nombre;
        this.curso = curso;
        this.nota = nota;
        this.pension = pension;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alumno{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", curso='").append(curso).append('\'');
        sb.append(", nota=").append(nota);
        sb.append(", pension=").append(pension);
        sb.append('}');
        return sb.toString();
    }
}
