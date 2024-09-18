package com.v11.cibertec.capitulo9.nio2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Stream;

public class PruebaNIO2 {
    public static void main(String[] args) {
        File directorio = new File("src/main/resources");
        Path path = Paths.get(directorio.toString(),"propiedades.properties");
        // Obteniendo info del archivo
        System.out.println("Nombre: " + path.getFileName());
        System.out.println("Primera Carpeta: " + path.getName(0));
        System.out.println("Número de nombres: " + path.getNameCount());
        System.out.println("Ruta completa: " + path.toAbsolutePath());

        // Trabajar con la case Files
        try{
            System.out.println("***** INFORMACION DEL ARCHIVO ******");
            Map<String,Object> atributos = Files.readAttributes(path,"*");
            atributos.forEach((k,v)-> System.out.println("llave:" + k + ": Value: " + v));

            // Mostrr los archivos de la carpeta
            System.out.println("***** Archivos de la carpeta *******");
            Stream<Path> stream = Files.list(directorio.toPath());
            stream.map(String::valueOf).forEach(System.out::println);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
