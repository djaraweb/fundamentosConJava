package com.v11.cibertec.capitulo9.serializable;

import java.io.*;

public class CreaArchivo {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        
        try {
            File directorio = new File("src/main/resources");
            // creamos el archivo
            oos = new ObjectOutputStream(new FileOutputStream(directorio + "/alumno.dat"));
            Direccion direccion=new Direccion("Piura", "Av. Junin 871");
            Alumno alumno = new Alumno("Deyvi","Jara", direccion);
            oos.writeObject(alumno);
            
            // Leemos el archivo
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(directorio + "/alumno.dat"));
            Alumno alumno1 = (Alumno) ois.readObject();
            System.out.println("alumno1 = " + alumno1);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                //oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
