package com.v11.cibertec.capitulo9;

import java.io.File;
import java.io.RandomAccessFile;

public class ModificarArchivo {
    static RandomAccessFile archivo = null;

    public static void main(String[] args) {
        try{
            File directorio = new File("src/main/resources");
            archivo = new RandomAccessFile(directorio + "/propiedades.properties","rw");
            muestraContenidoArchivo();
            archivo.seek(archivo.length());
            archivo.writeUTF("version = 3.2");
            muestraContenidoArchivo();
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                archivo.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    static void muestraContenidoArchivo(){
        try{
            archivo.seek(0);
            while   (archivo.read()!=-1){
                archivo.seek(archivo.getFilePointer()-1);
                System.out.println(archivo.readLine());
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
