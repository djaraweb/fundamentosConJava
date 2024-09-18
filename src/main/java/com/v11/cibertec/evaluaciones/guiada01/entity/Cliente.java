package pe.edu.cibertec.evaluaciones.guiada01.entity;

import java.util.InputMismatchException;

public class Cliente {
    private String Nombres;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private String mesNacimiento;
    private String NroDni;
    private Double Sueldo = 0.0;
    private Double MontoPrestamo = 0.0;
    private Double tasaInteres = 0.0;

    public String getNombres() {
        return Nombres;
    }

    private boolean verificarSiStringContieneNumeros(String cadena) {
        char[] caracteresNombres = cadena.toCharArray();
        for (char caracterNombre : caracteresNombres) {
            if (Character.isDigit(caracterNombre)) {
                return true;
            }
        }
        return false;
    }

    private boolean verificarSiStringContieneLetras(String cadena) {
        char[] caracteresNombres = cadena.toCharArray();
        for (char caracterNombre : caracteresNombres) {
            if (Character.isLetter(caracterNombre)) {
                return true;
            }
        }
        return false;
    }

    private boolean verificarSiStringEsUnNumero(String cadena) {
        boolean isNumeric = true;
        for (int i = 0; i < cadena.length(); i++) {
            if (!Character.isDigit(cadena.charAt(i))) {
                isNumeric = false;
            }
        }
        return isNumeric;
    }

    public void setNombres(String nombres) {
        if (verificarSiStringContieneNumeros(nombres))
            throw new InputMismatchException("El valor ingresado NO debe contener números");

        Nombres = nombres;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        if (verificarSiStringContieneNumeros(apellidoPaterno))
            throw new InputMismatchException("El valor ingresado NO debe contener números");
        ApellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        if (verificarSiStringContieneNumeros(apellidoMaterno))
            throw new InputMismatchException("El valor ingresado NO debe contener números");
        ApellidoMaterno = apellidoMaterno;
    }

    public String getNombresApellidos(){
        return this.getNombres() + " " + this.getApellidoPaterno() + " " + this.getApellidoMaterno();
    }

    public String getMesNacimiento() {
        return mesNacimiento;
    }

    public void setTasaInteres(Double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public Double getTasaInteres() {
        return tasaInteres;
    }

    public void setMesNacimiento(String mesNacimiento) {
        this.mesNacimiento = mesNacimiento.toUpperCase();
        switch (this.mesNacimiento) {
            case "ENERO":
                this.tasaInteres = 0.01;
                break; //(1%)
            case "FEBRERO":
                this.tasaInteres = 0.02;break; //(2%)
            case "MARZO":
                this.tasaInteres = 0.03;break; //(3%)
            case "ABRIL":
                this.tasaInteres = 0.04;break; //(4%)
            case "MAYO":
                this.tasaInteres = 0.05;break; //(5%)
            case "JUNIO":
                this.tasaInteres = 0.06;break; //(6%)
            case "JULIO":
                this.tasaInteres = 0.07;break; //(7%)
            case "AGOSTO":
                this.tasaInteres = 0.08;break; //(8%)
            case "SETIEMBRE":
                this.tasaInteres = 0.09;break; //(9%)
            case "OCTUBRE":
                this.tasaInteres = 0.10;break; //(10%)
            case "NOVIEMBRE":
                this.tasaInteres = 0.11;break; //(11%)
            case "DICIEMBRE":
                this.tasaInteres = 0.12;break; //(12%)
            default:
                throw new InputMismatchException("Nombre del Mes " + this.getMesNacimiento() + "Ingresado No es Correcto");
        }
    }

    public String getNroDni() {
        return NroDni;
    }

    public void setNroDni(String nroDni) {
        NroDni = nroDni;
        if (!verificarSiStringEsUnNumero(nroDni))
            throw new InputMismatchException("El Dni Ingresado : " + this.getNroDni() + " No es correcto");
        if (nroDni.length()>8)
            throw new InputMismatchException("El Dni Ingresado : " + this.getNroDni() + " debe tener 8 Caracteres");
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(Double sueldo) {
        Sueldo = sueldo;
    }

    public Double getMontoPrestamo() {
        return MontoPrestamo;
    }

    public void setMontoPrestamo(Double montoPrestamo) {
        MontoPrestamo = montoPrestamo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nombres='" + Nombres + '\'' +
                ", ApellidoPaterno='" + ApellidoPaterno + '\'' +
                ", ApellidoMaterno='" + ApellidoMaterno + '\'' +
                ", mesNacimiento='" + mesNacimiento + '\'' +
                ", NroDni='" + NroDni + '\'' +
                ", Sueldo=" + Sueldo +
                ", MontoPrestamo=" + MontoPrestamo +
                '}';
    }
}
