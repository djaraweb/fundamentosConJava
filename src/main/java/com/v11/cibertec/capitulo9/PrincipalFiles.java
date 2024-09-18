package com.v11.cibertec.capitulo9;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrincipalFiles {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("***** Trabajando con Ficheros *****");
        System.out.println("--------------------------------");
        //String rutaArchivos = "src"+File.pathSeparator + "main" + File.pathSeparator + "resources" + File.pathSeparator;
        String rutaArchivos = "src/main/resources/";

        File fichero = new File(rutaArchivos + "miarchivo.txt");
        try {
            fichero.createNewFile();
            if (fichero.exists()) {
                System.out.println("Se creo el archivo");
            } else {
                System.out.println("Se tuvo problemas para crear el archivo");
            }

            System.out.println("Meta información del fichero");
            System.out.println("AbsolutePath:" + fichero.getAbsolutePath());
            System.out.println("canRead:" + fichero.canRead());
            System.out.println("canWrite:" + fichero.canWrite());
            System.out.println("canExecute:" + fichero.canExecute());

            System.out.println("Files en : " + rutaArchivos);
            File listaFicheros = new File(rutaArchivos);
            String archivos[] = listaFicheros.list();
            //if (archivos != null) {
            for (int i = 0; i < archivos.length; i++) {
                System.out.println(archivos[i]);
            }
            //}

        } catch (IOException e) {
            Logger.getLogger(PrincipalFiles.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
