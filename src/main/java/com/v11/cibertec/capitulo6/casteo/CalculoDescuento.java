package com.v11.cibertec.capitulo6.casteo;

public class CalculoDescuento {
    private static int contadorDsctos = 0;

    public final static double RANGO_INICIO_DSCTO = 125.25;
    public final static double RANGO_FIN_DSCTO = 200.50;
    public final static int PORCENTAJE_DSCTO = 5;

    public static double aplicarDescuento(double cantidad) {
        contadorDsctos++;
        System.out.println("Descuentos aplicados hasta el momento = " + contadorDsctos);
        if (contadorDsctos < 4) {
            double porcentaje = ((double) PORCENTAJE_DSCTO) / 100;
            return cantidad * porcentaje;
        } else {
            return 0;
        }
    }

}
