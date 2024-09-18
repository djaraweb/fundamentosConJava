package com.v11.cibertec.capitulo9.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class XMLConJava {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1,"Arroz integral", 15.36);
        //Producto producto2 = new Producto(2,"Azucar integral", 12.36);
        objetoaXML(producto1);
        //objetoaXML(producto2);

    }
    private static void objetoaXML(Producto producto){
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(Producto.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // poniendo formato a la salida:
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            // Enviar el XML al Archivo
            File directorio = new File("src/main/resources");
            File archivo = new File(directorio + "/producto.xml");
            jaxbMarshaller.marshal(producto, archivo);

        }catch (JAXBException e){
            e.printStackTrace();
        }
    }
}
