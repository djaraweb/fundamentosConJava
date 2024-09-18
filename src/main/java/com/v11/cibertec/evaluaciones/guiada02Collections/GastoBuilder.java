package pe.edu.cibertec.evaluaciones.guiada02Collections;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GastoBuilder {

    public static Gasto crearGasto(Scanner scanner){

        System.out.println("Ingrese el nombre del Gasto:");
        String nombreGasto = scanner.nextLine();
        System.out.println("Ingrese el importe del Gasto:");
        Double importeGasto = scanner.nextDouble();
        scanner.nextLine();
        Gasto gasto = new Gasto();
        gasto.setNombreGasto(nombreGasto);
        gasto.setImporteGasto(importeGasto);
        return gasto;
    }

    public static void aplicarIVA(List<Gasto> listaGastos){
        Iterator<Gasto> iterator = listaGastos.iterator();
        while(iterator.hasNext()){ // Verifica si tiene elementos
            Gasto gasto = iterator.next(); // Obtiene el objeto de la lista
            gasto.setImporteGasto(Math.round ((gasto.getImporteGasto()*(1+Principal.IVA))*100.0)/100.0);
        }
    }
}
