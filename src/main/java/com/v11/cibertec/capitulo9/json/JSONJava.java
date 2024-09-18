package com.v11.cibertec.capitulo9.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSONJava {
    public static void main(String[] args) {

        try {
            Producto producto = new Producto(1, "Plumones rojos", 5.96);
            ObjectMapper mapper = new ObjectMapper();
            File directorio = new File("src/main/resources");
            File archivo = new File(directorio + "/producto.json");

            mapper.writeValue(archivo, producto);

            // Imrimir en consola la info en json

            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(producto);
            System.out.println("json = " + json);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
