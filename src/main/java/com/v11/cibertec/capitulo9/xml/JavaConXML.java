package com.v11.cibertec.capitulo9.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JavaConXML {

    public static void main(String[] args) {
        File directorio = new File("src/main/resources");
        File archivo = new File(directorio + "/producto.xml");
        JAXBContext jaxbContext;

        try{
             jaxbContext = JAXBContext.newInstance(Producto.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Producto producto = (Producto) jaxbUnmarshaller.unmarshal(archivo);
            System.out.println(producto);

        }catch (JAXBException e){
            e.printStackTrace();
        }
    }
}
