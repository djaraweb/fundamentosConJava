package com.v11.cibertec.capitulo7.stream;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.*;

public class EjecutoraStream {

    public static void main(String[] args) {

        List<Alumno> salonFundamentals = new ArrayList<>();
        salonFundamentals.add(new Alumno("Dennys", "Java", 18,600.));
        salonFundamentals.add(new Alumno("Maria", "Java", 20,1600.));
        salonFundamentals.add(new Alumno("Juan", "Java", 11,800.));
        salonFundamentals.add(new Alumno("Ricardo", "Java", 12,900.));
        salonFundamentals.add(new Alumno("David", "Java", 12,100.));

        System.out.println("lista: " + salonFundamentals + "\n");
        System.out.println("*******************");
        System.out.println("*********** Streams  ********");

        System.out.println("Imprimir elementos usando foreach");
        salonFundamentals.stream().forEach((alumno -> System.out.println(alumno)));

        System.out.println("Realizando un filtro de elementos");
        salonFundamentals.stream()
                .filter((alumno -> alumno.getNota() > 13))
                .forEach(alumno -> System.out.println(alumno));

        System.out.println("Pensiones con descuento");
        salonFundamentals.stream()
                .filter((alumno -> alumno.getNota() > 13))
                .mapToDouble((alumno)-> alumno.getPension()*0.80)
                .forEach(mipension -> System.out.println(mipension));

        salonFundamentals.stream()
                .skip(3)
                .forEach(alumno -> System.out.println(alumno));

        salonFundamentals.stream()
                .limit(4)
                .forEach(alumno -> System.out.println(alumno));

        System.out.println("Ordenar los streams ascendente");
        salonFundamentals.stream()
                .sorted(comparing(Alumno::getNota))
                .forEach(alumno -> System.out.println(alumno));

        System.out.println("Ordenar los streams descendente");
        salonFundamentals.stream()
                .sorted(comparing(Alumno::getNota).reversed())
                .forEach(alumno -> System.out.println(alumno));
    }

}
