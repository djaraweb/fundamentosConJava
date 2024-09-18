package com.v11.cibertec.capitulo10.conexion.entities;

import java.io.Serializable;

/**
 *
 * @author Adminfoco
 */
public class Persona implements Serializable{
    private int codigoPersona;
    private String nombres;
    private String apellidos;
    private String ciudad;
    private String direccion;
    private String email;
    private String dni;

    public Persona() {
    }

    public Persona(int codigoPersona, String nombres, String apellidos, String ciudad, String direccion, String email, String dni) {
        this.codigoPersona = codigoPersona;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.email = email;
        this.dni = dni;
    }

    public int getCodigoPersona() {
        return codigoPersona;
    }

    public void setCodigoPersona(int codigoPersona) {
        this.codigoPersona = codigoPersona;
    }

    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("codigoPersona=").append(codigoPersona);
        sb.append(", nombres='").append(nombres).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", ciudad='").append(ciudad).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
