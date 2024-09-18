package pe.edu.cibertec.capitulo5.encapsulamiento;

public class Principal {

    public static void main(String[] args) {
        Fraccion miFraccion = new Fraccion();
        miFraccion.setNumerador(10);
        miFraccion.setDenominador(3);

        miFraccion.imprimirValorDecimal();

    }
}
