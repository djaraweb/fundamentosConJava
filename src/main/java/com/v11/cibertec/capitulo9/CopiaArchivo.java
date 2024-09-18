package com.v11.cibertec.capitulo9;

import java.io.*;

public class CopiaArchivo {

    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File directorio = new File("src/main/resources");
            fileReader = new FileReader(directorio + "/propiedades.properties" );
            fileWriter = new FileWriter(directorio + "/copia.properties");

            BufferedReader br = new BufferedReader(fileReader);

            String linea;
            System.out.println("*** Mostrar contenido de file *** ");
            while((linea=br.readLine())!=null){
                fileWriter.write(linea + "\n");
                System.out.println(linea);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                fileReader.close();
                fileWriter.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }

    }
}
