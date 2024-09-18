package com.v17.lecturaExcel.examples;

import com.v17.lecturaExcel.modelos.Amigo;
import com.v17.utilities.ExcelReader;
import java.util.Comparator;

public class Ejercicio1Test {

    public static void main(String[] args) {
        showExample1();
        showExample2();
        showExample3();
    }

    static void showExample1(){
        System.out.println("******* Ejercicio 01 ********");
        final var nameEmpresa = "XBOX";
        System.out.printf("filtrando elementos por empresa: %s", nameEmpresa);
        final var videoJuegosPorEmpresa = ExcelReader
                .getListaVideojuegos()
                .stream()
                .filter(amigo -> amigo.getEmpresa().equals(nameEmpresa))
                .toList();
        System.out.println(videoJuegosPorEmpresa);
        System.out.println("End-> Ejercicio 01");
    }

    static void showExample2(){
        System.out.println("******* Ejercicio 02 ********");
        System.out.println("Init-> Ejercicio 02");
        System.out.println("leyendo informacion de excel");
        final var tipoAmigo = "ABOGADO";
        System.out.printf("filtrando lista de amigos por tipo: %s", tipoAmigo);
        System.out.println("Ordenamos lista alfabeticamente por nombre A -> Z");

        final var listaAmigosPorTipo = ExcelReader
                .getListaAmigos()
                .stream()
                .filter(amigo -> amigo.getTipo().equals(tipoAmigo))
                .sorted(Comparator.comparing(Amigo::getNombre))
                .toList();

        System.out.println(listaAmigosPorTipo);
        System.out.println("End-> Ejercicio 02");
    }

    static void showExample3(){
        System.out.println("******* Ejercicio 03 ********");
        System.out.println("Init-> Ejercicio 03");
        System.out.println("leyendo informacion de excel");
        final var filtro = "T";
        final var videoJuegosFiltrados = ExcelReader
                .getListaVideojuegos()
                .stream()
                .filter(video -> video.getNombre().startsWith(filtro))
                .toList();

        System.out.println("Imprimir en consola la información de todos los juegos que comiencen con la\n" +
                "letra T");
        System.out.println(videoJuegosFiltrados);
        System.out.println("End-> Ejercicio 03");
    }
}
