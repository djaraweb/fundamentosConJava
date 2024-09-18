package com.v11.cibertec.capitulo13;

//import org.slf4j.Logger;
import java.util.ArrayList;

public class PrincipalLogger {

    //static final Logger logger = LogManager.getLogger(Bar.class.getName());



    public static void main(String[] args) {
        System.out.println("Trabajando con Loggers");
// dennys.jimenez01@gmail.com

        String array[] = {"Lunes","Martes"};
        System.out.println("size : " + array.length);

        ArrayList al = new ArrayList();
        // Añadir elementos a un ArrayList
        al.add("Victor");
        al.add("Luis");
        al.add("Elena");
        int tamanio = al.size();
        System.out.println("El número de elementos es de "+tamanio);

    }
}
