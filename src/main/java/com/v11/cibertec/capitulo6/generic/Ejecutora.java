package com.v11.cibertec.capitulo6.generic;

public class Ejecutora {
    public static void main(String[] args) {
        Generica<Integer> instancia1 = new Generica<>(30);
        instancia1.mostrarTipo();
        int valor = instancia1.getPropiedad();
        // Notar que no se necesita castear
        System.out.println(" El valor es: " + valor);

        Generica<String> instancia2 = new Generica<>("Hola Mundo");
        instancia2.mostrarTipo();
        String valor2 = instancia2.getPropiedad();
        // Notar que no se necesita castear
        System.out.println(" El valor es: " + valor2);

    }
}
