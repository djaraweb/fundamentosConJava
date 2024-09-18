package pe.edu.cibertec.evaluaciones.guiada03Cajero.utils;

public class CuentaUtilitario {

    public static final String CODIGO_ENTIDAD = "002";
    public static final String CODIGO_AGENCIA = "051";
    public static int secuencial = 1000;

    public static String crearCuenta() {
        secuencial++;
        return CODIGO_ENTIDAD + CODIGO_AGENCIA + "000" + secuencial;
    }
}
