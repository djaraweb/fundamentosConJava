package com.v11.cibertec.capitulo9.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class JavaJSON {
    public static void main(String[] args) {
        try{
            File directorio = new File("src/main/resources");
            File archivo = new File(directorio+"/producto.json");

            ObjectMapper mapper = new ObjectMapper();
            Producto producto = mapper.readValue(archivo, Producto.class);
            System.out.println("producto = " + producto);

            System.out.println("Con formato:" +
                    mapper.writerWithDefaultPrettyPrinter().writeValueAsString(producto)
                    );

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

