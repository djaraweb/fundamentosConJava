package com.v11.cibertec.capitulo10;

import com.v11.cibertec.capitulo10.conexion.dao.PersonaDAO;
import com.v11.cibertec.capitulo10.conexion.entities.Persona;

import java.util.List;

public class EjecutoraDemo {


    public static void main(String[] args) {
        PersonaDAO pdao = new PersonaDAO();
        System.out.println("Listando las personas");
        List<Persona> lista = pdao.obtenerPersonas();
        lista.stream().forEach(System.out::println);
        System.out.println("*****************************************************");
        System.out.println("Creando elemento 10");


        System.out.println("Insertando Persona");
        Persona persona = new Persona(10, "leonel", "Mesi", "lima", "otracasa", "leom@com", "12345678");
        pdao.insertar(persona);


        System.out.println("*****************************************************");
        System.out.println("Listando las personas despues de agregar elemento 10");
        lista = pdao.obtenerPersonas();
        lista.stream().forEach(System.out::println);

        System.out.println("*****************************************************");
        System.out.println("Insertando otra persona sin codigo");
        Persona otraPersona = new Persona();
        otraPersona.setNombres("Noel");
        otraPersona.setApellidos("Flores");
        otraPersona.setDireccion("otra direccion");
        otraPersona.setCiudad("Iquitos");
        otraPersona.setDni("33333333");
        otraPersona.setEmail("hola");
        pdao.insertarSinCodigo(otraPersona);
        System.out.println("*****************************************************");
        System.out.println("Listando las personas despues de agregar soin codigo");
        lista = pdao.obtenerPersonas();
        lista.stream().forEach(System.out::println);


        System.out.println("*****************************************************");

        System.out.println("Obteniendo persona con codigo 10");
        Persona persona2 = pdao.obtenerPersona(10);
        System.out.println("Persona: " + persona2);

        System.out.println("*****************************************************");

        System.out.println("Actualizando elemento 10");

        Persona personaNueva = new Persona(10, "Juanito", "Perez", "lima", "otracasa", "leom@com", "12345678");
        pdao.actualizarPersona(personaNueva);
        System.out.println("*****************************************************");
        System.out.println("Lista actualizada");
        lista = pdao.obtenerPersonas();
        lista.stream().forEach(System.out::println);
        System.out.println("*****************************************************");
        System.out.println("Eliminando Persona 10");
        pdao.eliminarPersona(persona);
        lista = pdao.obtenerPersonas();
        lista.stream().forEach(System.out::println);

    }
}