package com.v11.cibertec.capitulo6.casteo;

public class Compra {

    public static void main(String[] args) {
        // Simular compra 1
        String producto = "Medias";
        double precio = 150.36;
        imprimirLinea(producto, precio);

        // Simular compra 2
        producto = "Chompa";
        precio = 183.15;
        imprimirLinea(producto, precio);

        // Simular compra 3
        producto = "Pantalón";
        precio = 168.00;
        imprimirLinea(producto, precio);

        // Simular compra 4
        producto = "Polo";
        precio = 200.20;
        imprimirLinea(producto, precio);
    }

    private static void imprimirLinea(String producto, double precio){
        if (estaEnRango(precio)){
            System.out.println("El descuento de " + producto + " con un precio de " + precio + " sería de " + CalculoDescuento.aplicarDescuento(precio));
        }
    }

    private static boolean estaEnRango(double compra){
        if (compra > CalculoDescuento.RANGO_INICIO_DSCTO && compra < CalculoDescuento.RANGO_FIN_DSCTO){
            return  true;
        }else {
            return false;
        }
    }
}
