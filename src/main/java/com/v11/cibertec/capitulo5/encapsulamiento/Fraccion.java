package pe.edu.cibertec.capitulo5.encapsulamiento;

public class Fraccion {
    private int numerador;
    private int denominador;
    private boolean racional;

    public boolean isRacional() {
        return racional;
    }

    public void setRacional(boolean racional) {
        this.racional = racional;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            System.out.println("Valor no permitido");
        } else {
            this.denominador = denominador;
        }

    }

    void imprimirValorDecimal() {
        double decimal = numerador / denominador;
        System.out.println("El valor de dividir Numerador/Denominador es: " + decimal);
    }

    void imprimirDenominador(){
        System.out.println("El denominador es: " + denominador);
    }
}
