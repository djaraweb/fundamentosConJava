package com.v11.cibertec.capitulo3;

import java.util.Scanner;

public class ProductoDescuento {

    public static void main(String[] args) {
        int descuento = 2;
        boolean rpta;
        int num=0;
        int x=0;
        int total =0;
        while(num>=x){
            Scanner scan = new Scanner(System.in);
            System.out.println("Producto con descuento TRUE/FALSE");
            rpta = scan.nextBoolean();
            if (rpta){
                System.out.println("Ingrese Precio Producto " + x);
                try {
                    total = scan.nextInt()+total - descuento;

                }catch (Exception e){
                    System.out.println("Error de formato Númerico" + e);
                }
            }
        }
    }
}
