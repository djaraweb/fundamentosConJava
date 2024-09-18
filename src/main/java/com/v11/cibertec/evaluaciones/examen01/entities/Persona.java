package pe.edu.cibertec.evaluaciones.examen01.entities;

import pe.edu.cibertec.evaluaciones.examen01.helpers.Util;

import java.util.InputMismatchException;

public class Persona {
    private String Nombres;
    private String ApellidoPaterno;
    private String Edad;
    private String NroDni;
    private String Sexo;
    private Double Peso = 0.0;
    private Double Altura = 0.0;

    public Persona(){

    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        if (Util.verificarSiStringContieneNumeros(nombres))
            throw new InputMismatchException("El valor ingresado NO debe contener números");
        Nombres = nombres;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        if (Util.verificarSiStringContieneNumeros(apellidoPaterno))
            throw new InputMismatchException("El valor ingresado NO debe contener números");
        ApellidoPaterno = apellidoPaterno;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        if (!Util.verificarSiStringEsUnNumero(edad))
            throw new InputMismatchException("La edad Ingresada " + edad + " No es correcta");
        Edad = edad;
    }

    public String getNroDni() {
        return NroDni;
    }

    public void setNroDni(String nroDni) {
        NroDni = nroDni;
        if (!Util.verificarSiStringEsUnNumero(nroDni))
            throw new InputMismatchException("El Dni Ingresado : " + this.getNroDni() + " No es correcto");
        if (nroDni.length()>8)
            throw new InputMismatchException("El Dni Ingresado : " + this.getNroDni() + " debe tener 8 Caracteres");
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        if (comprobarSexo(sexo))
            Sexo = sexo;
        else
            throw new InputMismatchException("El Sexo Ingresado : " + sexo + " No es correcto");
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double peso) {
        Peso = peso;
    }

    public Double getAltura() {
        return Altura;
    }

    public void setAltura(Double altura) {
        Altura = altura;
    }


    // Metodos comunes
    public boolean esMayorDeEdad() {
        int edadPaciente = Integer.parseInt(this.getEdad());
        if (edadPaciente > 18) {
            return true;
        }
        return false;
    }
    private boolean comprobarSexo(String sexo){
        if (sexo.toUpperCase().equals("MASCULINO")|| sexo.toUpperCase().equals("FEMENINO")){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Nombres='" + Nombres + '\'' +
                ", ApellidoPaterno='" + ApellidoPaterno + '\'' +
                ", Edad='" + Edad + '\'' +
                ", NroDni='" + NroDni + '\'' +
                ", Sexo=" + Sexo +
                ", Peso=" + Peso +
                ", Altura=" + Altura +
                '}';
    }
}
